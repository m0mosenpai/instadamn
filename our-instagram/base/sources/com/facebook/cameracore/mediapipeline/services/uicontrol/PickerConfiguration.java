package com.facebook.cameracore.mediapipeline.services.uicontrol;

/* loaded from: classes4.dex */
public class PickerConfiguration {
    public final ItemConfiguration[] mItems;
    public final int mSelectedIndex;

    /* loaded from: classes4.dex */
    public class ItemConfiguration {
        public final String mId;
        public final byte[] mImageData;
        public final String mImageUri;
        public final String mTitle;

        public ItemConfiguration(String str, byte[] bArr, String str2, String str3) {
            this.mImageUri = str;
            this.mImageData = bArr;
            this.mTitle = str2;
            this.mId = str3;
        }
    }

    public PickerConfiguration(int i, ItemConfiguration[] itemConfigurationArr) {
        this.mSelectedIndex = i;
        this.mItems = itemConfigurationArr;
    }
}
