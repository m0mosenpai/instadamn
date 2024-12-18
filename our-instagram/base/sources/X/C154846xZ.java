package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.6xZ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C154846xZ extends MTJ implements InterfaceC154856xa {
    public Integer A00;
    public String A01;
    public boolean A02;
    public Integer A03;
    public String A04;
    public boolean A05;
    public boolean A06;
    public final C69613Av A07;

    public final void A0S(AbstractC115105If abstractC115105If) {
        String str;
        Integer num;
        Integer num2 = null;
        if (abstractC115105If != null) {
            InterfaceC40821up interfaceC40821up = (InterfaceC40821up) abstractC115105If.A00();
            if (interfaceC40821up != null) {
                num2 = Integer.valueOf(interfaceC40821up.getStatusCode());
                str = interfaceC40821up.getErrorMessage();
            } else {
                Throwable A01 = abstractC115105If.A01();
                if (A01 != null) {
                    if (A01 instanceof C53093Ne6) {
                        C53093Ne6 c53093Ne6 = (C53093Ne6) A01;
                        if (c53093Ne6 != null) {
                            num = Integer.valueOf(c53093Ne6.A00);
                        } else {
                            num = null;
                        }
                        str = null;
                        num2 = num;
                    } else {
                        str = A01.getMessage();
                    }
                }
            }
            this.A03 = num2;
            C69613Av c69613Av = ((MTJ) this).A00;
            if (str != null || str.length() == 0) {
                str = "request_failed";
            }
            c69613Av.A07(str);
        }
        str = null;
        this.A03 = num2;
        C69613Av c69613Av2 = ((MTJ) this).A00;
        if (str != null) {
        }
        str = "request_failed";
        c69613Av2.A07(str);
    }

    @Override // X.AbstractC69603Au
    public void A05() {
        String str = this.A04;
        if (str != null) {
            A0J("asset_id", str);
        }
        String str2 = this.A01;
        if (str2 != null) {
            A0J("tab_id", str2);
        }
        Integer num = this.A00;
        if (num != null) {
            A0G("num_videos", num.intValue());
        }
        Integer num2 = this.A03;
        if (num2 != null) {
            A0G("http_status_code", num2.intValue());
        }
        A0K("cached_response", this.A02);
    }

    public final void A0T(String str) {
        if (str != null && str.length() != 0) {
            this.A04 = str;
        }
    }

    @Override // X.InterfaceC154856xa
    public final void D4p() {
        if (!this.A06) {
            this.A07.A08(null);
            this.A06 = true;
        }
    }

    @Override // X.InterfaceC154856xa
    public final void D4q() {
        if (!this.A05) {
            this.A07.A07("request_failed");
            this.A05 = true;
        }
    }

    @Override // X.InterfaceC154856xa
    public final void D4r() {
        if (!this.A05) {
            this.A07.A05();
            this.A05 = true;
        }
    }

    public C154846xZ(UserSession userSession, String str, int i) {
        super(userSession, str, i);
        this.A07 = A02("fetch_first_thumbnail");
    }
}
