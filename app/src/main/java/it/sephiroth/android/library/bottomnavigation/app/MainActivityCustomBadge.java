package it.sephiroth.android.library.bottomnavigation.app;

import android.os.Bundle;

import it.sephiroth.android.library.bottomnavigation.app.providers.CustomBadgeProvider;

public class MainActivityCustomBadge extends TestBottomNavigationActivity {

    @Override
    protected int getActivityLayoutResId() {
        return R.layout.activity_main_custom_badge;
    }

    @Override
    protected void initializeBottomNavigation(final Bundle savedInstanceState) {
        getBottomNavigation().setDefaultSelectedIndex(0);

        CustomBadgeProvider provider = (CustomBadgeProvider) getBottomNavigation().getBadgeProvider();
        provider.show(R.id.bbn_item3);
        provider.show(R.id.bbn_item5);
    }

//    @Override
//    protected void initializeUI(final Bundle savedInstanceState) {
//        final FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById(R.id.fab);
//        assert floatingActionButton != null;
//        floatingActionButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                int selectedIndex = getBottomNavigation().getSelectedIndex() + 1;
//                final int totalCount = getBottomNavigation().getMenuItemCount();
//
//                if (selectedIndex >= totalCount) {
//                    selectedIndex = 0;
//                }
//
//                final int itemId = getBottomNavigation().getMenuItemId(selectedIndex);
//
//                CustomBadgeProvider provider = (CustomBadgeProvider) getBottomNavigation().getBadgeProvider();
//
//                if (provider.hasBadge(itemId)) {
//                    int count = provider.getBadgeTextCount(itemId);
//                    provider.show(itemId, count + 1);
//                } else {
//                    provider.show(itemId, 1);
//                }
//            }
//        });
//    }
}
