package com.instagram.igds.components.bottomsheet;

/* loaded from: classes4.dex */
public final class BottomSheetFragmentLifecycleUtil {
    public static void cleanupReferences(BottomSheetFragment bottomSheetFragment) {
        bottomSheetFragment.bottomSheetContainer = null;
        bottomSheetFragment.contentView = null;
        bottomSheetFragment.dragHandleFrame = null;
        bottomSheetFragment.dragHandleView = null;
        bottomSheetFragment.dragHandleViewPrism = null;
        bottomSheetFragment.titleAndNavContainer = null;
        bottomSheetFragment.titleTextView = null;
        bottomSheetFragment.subtitleTextView = null;
        bottomSheetFragment.elementAboveTitleView = null;
        bottomSheetFragment.navBarDivider = null;
        bottomSheetFragment.buttonContainer = null;
        bottomSheetFragment.leftNavButtonIcon = null;
        bottomSheetFragment.leftNavButtonText = null;
        bottomSheetFragment.rightNavButtonIcon = null;
        bottomSheetFragment.rightNavButtonText = null;
        bottomSheetFragment.secondaryRightNavButtonIcon = null;
        bottomSheetFragment.rightLoadingSpinnerIcon = null;
        bottomSheetFragment.navButtonStartGuideline = null;
        bottomSheetFragment.navButtonEndGuideline = null;
        bottomSheetFragment.bottomButton = null;
        bottomSheetFragment._actionBarService = null;
    }
}
