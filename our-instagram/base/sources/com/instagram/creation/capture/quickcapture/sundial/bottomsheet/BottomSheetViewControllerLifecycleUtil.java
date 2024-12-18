package com.instagram.creation.capture.quickcapture.sundial.bottomsheet;

/* loaded from: classes9.dex */
public final class BottomSheetViewControllerLifecycleUtil {
    public static void cleanupReferences(BottomSheetViewController bottomSheetViewController) {
        bottomSheetViewController.bottomSheetLayout = null;
        bottomSheetViewController.bottomSheetContentContainer = null;
        bottomSheetViewController.bottomSheetContentView = null;
        bottomSheetViewController.bottomSheetHandle = null;
        bottomSheetViewController.bottomSheetTopButtonContainer = null;
        bottomSheetViewController.bottomSheetBottomButtonContainer = null;
        bottomSheetViewController.bottomSheetCancelButton = null;
        bottomSheetViewController.bottomSheetBottomTitle = null;
        bottomSheetViewController.bottomSheetTopTitle = null;
        bottomSheetViewController.bottomSheetTopBackButton = null;
        bottomSheetViewController.bottomSheetDoneButton = null;
    }
}
