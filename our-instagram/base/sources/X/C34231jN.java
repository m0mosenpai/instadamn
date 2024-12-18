package X;

import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.mediasize.ExtendedImageUrl;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: X.1jN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C34231jN extends AbstractC29011ae implements InterfaceC29491bQ {
    public static final C1OZ A05 = new C1OZ() { // from class: X.1jO
        @Override // X.C1OZ
        public final /* bridge */ /* synthetic */ Object E3S(C16L c16l) {
            C14360o3.A0B(c16l, 0);
            C34231jN parseFromJson = F67.parseFromJson(c16l);
            C14360o3.A07(parseFromJson);
            return parseFromJson;
        }

        @Override // X.C1OZ
        public final void EOu(AnonymousClass182 anonymousClass182, Object obj) {
            String str;
            C14360o3.A0B(anonymousClass182, 0);
            C14360o3.A0B(obj, 1);
            C34231jN c34231jN = (C34231jN) obj;
            anonymousClass182.A0d();
            String str2 = c34231jN.A02;
            if (str2 != null) {
                anonymousClass182.A0S("fundraiser_id", str2);
                String str3 = c34231jN.A03;
                if (str3 != null) {
                    anonymousClass182.A0S("fundraiser_name", str3);
                    String str4 = c34231jN.A00;
                    if (str4 != null) {
                        anonymousClass182.A0S("fundraiser_attribution", str4);
                        String str5 = c34231jN.A01;
                        if (str5 != null) {
                            anonymousClass182.A0S("details", str5);
                        }
                        String str6 = c34231jN.A04;
                        if (str6 != null) {
                            anonymousClass182.A0S("cover_photo_url", str6);
                        }
                        AbstractC47856LCb.A00(anonymousClass182, c34231jN);
                        anonymousClass182.A0a();
                        return;
                    }
                    str = "fundraiserAttribution";
                } else {
                    str = "fundraiserName";
                }
            } else {
                str = "fundraiserId";
            }
            C14360o3.A0F(str);
            throw C00O.createAndThrow();
        }
    };
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;

    @Override // X.C1OW
    public final String A02() {
        return "send_fundraiser_share_message";
    }

    @Override // X.InterfaceC29021af
    public final C2EY Ar9() {
        return C2EY.A0z;
    }

    @Override // X.AbstractC29011ae
    public final /* bridge */ /* synthetic */ Object A05() {
        String str;
        ExtendedImageUrl extendedImageUrl = new ExtendedImageUrl("https://static.xx.fbcdn.net/assets/?set=instagram&name=donations-pano&density=4&size=24", 24, 24);
        String str2 = this.A03;
        if (str2 != null) {
            String str3 = this.A01;
            String str4 = this.A04;
            if (str4 == null) {
                str4 = "https://static.xx.fbcdn.net/assets/?set=instagram_wellbeing_illustrations&name=giving-sharesheet-background-coin&density=4";
            }
            ExtendedImageUrl extendedImageUrl2 = new ExtendedImageUrl(str4, 271, AbstractC62862SUj.MAX_FACTORIAL);
            String str5 = this.A00;
            if (str5 != null) {
                String str6 = this.A02;
                if (str6 != null) {
                    List singletonList = Collections.singletonList(AbstractC47996LLi.A08(extendedImageUrl, extendedImageUrl2, str2, str3, str5, null, String.format(Locale.getDefault(), "instagram://fundraiser?fundraiser_id=%s&source_name=%s", str6, "direct_message")));
                    C14360o3.A07(singletonList);
                    return singletonList;
                }
                str = "fundraiserId";
            } else {
                str = "fundraiserAttribution";
            }
        } else {
            str = "fundraiserName";
        }
        C14360o3.A0F(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC29491bQ
    public final C29481bP ACZ() {
        LGP A00 = C47842LBj.A00();
        C2EY c2ey = C2EY.A0w;
        String str = this.A02;
        if (str != null) {
            String A01 = A00.A01(c2ey, str);
            return new C29481bP(new C206409Bx(A01), null, ((C1OW) this).A02, null, (DirectThreadKey) C7R().get(0), ((AbstractC29011ae) this).A02, NetInfoModule.CONNECTION_TYPE_NONE, ((AbstractC29011ae) this).A00, false, false);
        }
        C14360o3.A0F("fundraiserId");
        throw C00O.createAndThrow();
    }
}
