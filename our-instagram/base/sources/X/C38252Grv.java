package X;

import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.api.schemas.AdFormatType;
import com.instagram.api.schemas.DynamicProductAdDisplayOption;
import com.instagram.api.schemas.IntentAwareAdsInfo;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Grv, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38252Grv {
    public AdFormatType A00;
    public C114555Fb A01;
    public C1s4 A02;
    public C114575Fd A03;
    public C87883vw A04;
    public C52r A05;
    public DynamicProductAdDisplayOption A06;
    public C114595Ff A07;
    public C108034tm A08;
    public C51L A09;
    public C5G3 A0A;
    public C102724k9 A0B;
    public C114615Fj A0C;
    public IEG A0D;
    public IKS A0E;
    public C5Fk A0F;
    public C5Fl A0G;
    public C38011pl A0H;
    public Boolean A0I;
    public Boolean A0J;
    public Boolean A0K;
    public Boolean A0L;
    public Boolean A0M;
    public Boolean A0N;
    public Integer A0O;
    public Integer A0P;
    public Long A0Q;
    public String A0R;
    public String A0S;
    public String A0T;
    public String A0U;
    public String A0V;
    public String A0W;
    public String A0X;
    public String A0Y;
    public String A0Z;
    public String A0a;
    public String A0b;
    public String A0c;
    public List A0d = C16930sl.A00;
    public List A0e;
    public List A0f;
    public List A0g;
    public List A0h;
    public List A0i;

    public final C206239Bg A00() {
        return new C206239Bg(C128085qc.A03(A01()), new C671831j(null, this.A0H, null, 0, 0, 0, 0, 0, 16382, false, false, false, false));
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [X.1ux, X.Gem] */
    public final C37469Gen A01() {
        C38321qM c38321qM;
        String str;
        IntentAwareAdsInfo intentAwareAdsInfo;
        C38321qM A0x = AbstractC25225BEi.A0x(A02(), 0);
        Long l = this.A0Q;
        if (l != null) {
            A0x.A0C.EQb(l);
        }
        EnumC40111tc A00 = AbstractC40091ta.A00(this.A0O);
        if (EnumC40111tc.A09 != A00 || (c38321qM = C38321qM.A0h.A0D(this.A0Z, A02())) == null) {
            c38321qM = (C38321qM) A02().get(0);
        }
        c38321qM.A0F = this.A0F;
        ?? abstractC40901ux = new AbstractC40901ux();
        abstractC40901ux.A0L = c38321qM;
        abstractC40901ux.A0M = A00;
        abstractC40901ux.A01 = this.A00;
        abstractC40901ux.A0n = A02();
        abstractC40901ux.A05 = this.A04;
        abstractC40901ux.A0J = this.A0B;
        abstractC40901ux.A08 = this.A05;
        abstractC40901ux.A0e = this.A0V;
        abstractC40901ux.A0a = this.A0S;
        abstractC40901ux.A0K = this.A0C;
        String str2 = this.A0X;
        if (str2 != null) {
            abstractC40901ux.A0g = str2;
            List list = this.A0h;
            if (list != null) {
                abstractC40901ux.A0q = ImmutableList.copyOf((Collection) list);
                String str3 = this.A0c;
                if (str3 != null) {
                    abstractC40901ux.A0l = str3;
                    String str4 = this.A0T;
                    if (str4 != null) {
                        abstractC40901ux.A0b = str4;
                        List list2 = this.A0e;
                        if (list2 != null) {
                            abstractC40901ux.A00 = ImmutableList.copyOf((Collection) list2);
                            abstractC40901ux.A0Z = this.A0R;
                            abstractC40901ux.A0m = ImmutableList.copyOf((Collection) this.A0d);
                            abstractC40901ux.A0h = this.A0Y;
                            abstractC40901ux.A00 = new C671831j(null, this.A0H, null, 0, 0, 0, 0, 0, 16382, false, false, false, false);
                            abstractC40901ux.A0P = this.A0F;
                            abstractC40901ux.A0Q = this.A0G;
                            abstractC40901ux.A0U = this.A0M;
                            abstractC40901ux.A0p = this.A0g;
                            abstractC40901ux.A09 = this.A06;
                            abstractC40901ux.A04 = this.A03;
                            abstractC40901ux.A02 = this.A01;
                            abstractC40901ux.A0S = this.A0J;
                            abstractC40901ux.A0o = this.A0f;
                            abstractC40901ux.A0X = this.A0P;
                            abstractC40901ux.A03 = this.A02;
                            abstractC40901ux.A0F = this.A09;
                            abstractC40901ux.A0A = this.A07;
                            IEG ieg = this.A0D;
                            if (ieg != null) {
                                intentAwareAdsInfo = ieg.A00;
                            } else {
                                intentAwareAdsInfo = null;
                            }
                            abstractC40901ux.A0E = intentAwareAdsInfo;
                            abstractC40901ux.A0i = this.A0a;
                            abstractC40901ux.A0V = this.A0N;
                            abstractC40901ux.A0R = this.A0I;
                            abstractC40901ux.A0T = this.A0K;
                            abstractC40901ux.A0D = this.A08;
                            C37469Gen A01 = abstractC40901ux.A01();
                            C14360o3.A0C(A01, "null cannot be cast to non-null type com.instagram.model.sponsored.DynamicInsertionAd<com.instagram.sponsored.asyncads.rules.gaprules.TargetPositionGapRules>");
                            return A01;
                        }
                        str = "cookies";
                    } else {
                        str = "adTitle";
                    }
                } else {
                    str = "trackingToken";
                }
            } else {
                str = "hideReasons";
            }
        } else {
            str = "label";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    public final List A02() {
        List list = this.A0i;
        if (list != null) {
            return list;
        }
        C14360o3.A0F(DialogModule.KEY_ITEMS);
        throw C00O.createAndThrow();
    }
}
