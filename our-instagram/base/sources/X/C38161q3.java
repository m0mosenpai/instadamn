package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
import java.util.List;

/* renamed from: X.1q3, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C38161q3 extends C0T6 implements InterfaceC38171q4 {
    public final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum A00;
    public final Boolean A01;
    public final Float A02;
    public final Float A03;
    public final Integer A04;
    public final List A05;

    @Override // X.InterfaceC38171q4
    public final C38161q3 EuR() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C38161q3) {
                C38161q3 c38161q3 = (C38161q3) obj;
                if (!C14360o3.A0K(this.A04, c38161q3.A04) || !C14360o3.A0K(this.A05, c38161q3.A05) || this.A00 != c38161q3.A00 || !C14360o3.A0K(this.A01, c38161q3.A01) || !C14360o3.A0K(this.A02, c38161q3.A02) || !C14360o3.A0K(this.A03, c38161q3.A03)) {
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A04;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        List list = this.A05;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum = this.A00;
        int hashCode3 = (hashCode2 + (iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum == null ? 0 : iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum.hashCode())) * 31;
        Boolean bool = this.A01;
        int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
        Float f = this.A02;
        int hashCode5 = (hashCode4 + (f == null ? 0 : f.hashCode())) * 31;
        Float f2 = this.A03;
        return hashCode5 + (f2 != null ? f2.hashCode() : 0);
    }

    @Override // X.InterfaceC38171q4
    public final Integer AwY() {
        return this.A04;
    }

    @Override // X.InterfaceC38171q4
    public final List B9g() {
        return this.A05;
    }

    @Override // X.InterfaceC38171q4
    public final IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum BIw() {
        return this.A00;
    }

    @Override // X.InterfaceC38171q4
    public final Float Bq2() {
        return this.A02;
    }

    @Override // X.InterfaceC38171q4
    public final Float Bq3() {
        return this.A03;
    }

    @Override // X.InterfaceC38171q4
    public final Boolean CWo() {
        return this.A01;
    }

    @Override // X.InterfaceC38171q4
    public final TreeUpdaterJNI F7o() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGAdsStoryInteractiveMediaInfoDataDict", CDH.A00(this));
    }

    public C38161q3(IGAdsStoryInteractiveMediaInfoDataDesignOptionEnum iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum, Boolean bool, Float f, Float f2, Integer num, List list) {
        this.A04 = num;
        this.A05 = list;
        this.A00 = iGAdsStoryInteractiveMediaInfoDataDesignOptionEnum;
        this.A01 = bool;
        this.A02 = f;
        this.A03 = f2;
    }
}
