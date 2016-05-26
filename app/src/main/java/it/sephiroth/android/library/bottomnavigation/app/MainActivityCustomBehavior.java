package it.sephiroth.android.library.bottomnavigation.app;

public class MainActivityCustomBehavior extends TestBottomNavigationActivity {

    @Override
    protected int getActivityLayoutResId() {
        return R.layout.activity_main_custom_behavior;
    }

//    @Override
//    protected void initializeUI(final Bundle savedInstanceState) {
//
//        final FloatingActionMenu floatingActionButton = (FloatingActionMenu) findViewById(R.id.fab);
//        assert floatingActionButton != null;
//        floatingActionButton.findViewById(R.id.fab_item1).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG).setAction(
//                    "Action",
//                    null
//                ).show();
//            }
//        });
//
//        if (null != getBottomNavigation() && null == savedInstanceState) {
//            getBottomNavigation().setDefaultSelectedIndex(0);
//            ((BottomBehavior) getBottomNavigation().getBehavior()).setOnExpandStatusChangeListener(
//                new BottomBehavior.OnExpandStatusChangeListener() {
//                    @Override
//                    public void onExpandStatusChanged(final boolean expanded, final boolean animate) {
//                        if (expanded) {
//                            floatingActionButton.showMenu(animate);
//                        } else {
//                            floatingActionButton.hideMenu(animate);
//                        }
//                    }
//                });
//
//            final BadgeProvider provider = getBottomNavigation().getBadgeProvider();
//            provider.show(R.id.bbn_item3);
//            provider.show(R.id.bbn_item4);
//        }
//    }
}
