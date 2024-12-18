package com.facebook.rp.platform.metaai.rsys.voicestate;

import X.AnonymousClass001;
import X.C0T6;
import X.C14360o3;
import com.google.gson.annotations.SerializedName;
import java.util.Arrays;

/* loaded from: classes9.dex */
public final class ReelsViewModel extends C0T6 {

    @SerializedName("reels_data")
    public final ReelsData[] reelsData;

    @SerializedName("reels_urls")
    public final String[] reelsUrls;

    public final String[] component1() {
        return this.reelsUrls;
    }

    public final ReelsData[] component2() {
        return this.reelsData;
    }

    public final ReelsViewModel copy(String[] strArr, ReelsData[] reelsDataArr) {
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ReelsViewModel) {
                ReelsViewModel reelsViewModel = (ReelsViewModel) obj;
                if (!C14360o3.A0K(this.reelsUrls, reelsViewModel.reelsUrls) || !C14360o3.A0K(this.reelsData, reelsViewModel.reelsData)) {
                }
            }
            return false;
        }
        return true;
    }

    public int hashCode() {
        String[] strArr = this.reelsUrls;
        int hashCode = (strArr == null ? 0 : Arrays.hashCode(strArr)) * 31;
        ReelsData[] reelsDataArr = this.reelsData;
        return hashCode + (reelsDataArr != null ? Arrays.hashCode(reelsDataArr) : 0);
    }

    public String toString() {
        return AnonymousClass001.A0v("ReelsViewModel(reelsUrls=", Arrays.toString(this.reelsUrls), ", reelsData=", Arrays.toString(this.reelsData), ')');
    }

    public static /* synthetic */ ReelsViewModel copy$default(ReelsViewModel reelsViewModel, String[] strArr, ReelsData[] reelsDataArr, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = reelsViewModel.reelsUrls;
        }
        if ((i & 2) != 0) {
            reelsDataArr = reelsViewModel.reelsData;
        }
        return new ReelsViewModel(strArr, reelsDataArr);
    }

    public final ReelsData[] getReelsData() {
        return this.reelsData;
    }

    public final String[] getReelsUrls() {
        return this.reelsUrls;
    }

    public ReelsViewModel(String[] strArr, ReelsData[] reelsDataArr) {
        this.reelsUrls = strArr;
        this.reelsData = reelsDataArr;
    }
}
