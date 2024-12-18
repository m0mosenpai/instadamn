package com.facebook.rsys.cowatch.gen;

import com.facebook.djinni.msys.infra.McfReference;
import com.facebook.simplejni.NativeHolder;

/* loaded from: classes12.dex */
public abstract class CowatchBrowseSurfaceApi {

    /* loaded from: classes12.dex */
    public final class CProxy extends CowatchBrowseSurfaceApi {
        public final NativeHolder mNativeHolder;

        public static native CowatchBrowseSurfaceApi createFromMcfType(McfReference mcfReference);

        private native boolean nativeEquals(Object obj);

        public static native long nativeGetMcfTypeId();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void back();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void dismiss();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void dismissSeasonPickerAction();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void expandMediaCellView(String str);

        public native int hashCode();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void loadNextPage();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void open(String str, boolean z, String str2, int i);

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void privacyNuxShown();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void search(String str);

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void selectSearchField();

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void selectShow(long j, long j2, int i);

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void selectShowSeason(String str, int i);

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void selectTabClientActionCreate(long j, boolean z);

        @Override // com.facebook.rsys.cowatch.gen.CowatchBrowseSurfaceApi
        public native void showSeasonPicker();

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && (obj instanceof CowatchBrowseSurfaceApi)) {
                return nativeEquals(obj);
            }
            return false;
        }

        public CProxy(NativeHolder nativeHolder) {
            this.mNativeHolder = nativeHolder;
        }
    }

    public abstract void back();

    public abstract void dismiss();

    public abstract void dismissSeasonPickerAction();

    public abstract void expandMediaCellView(String str);

    public abstract void loadNextPage();

    public abstract void open(String str, boolean z, String str2, int i);

    public abstract void privacyNuxShown();

    public abstract void search(String str);

    public abstract void selectSearchField();

    public abstract void selectShow(long j, long j2, int i);

    public abstract void selectShowSeason(String str, int i);

    public abstract void selectTabClientActionCreate(long j, boolean z);

    public abstract void showSeasonPicker();
}
