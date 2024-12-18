package X;

import com.instagram.common.session.UserSession;
import java.util.LinkedList;
import java.util.List;

/* renamed from: X.NIw, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C52452NIw extends OK7 {
    public Boolean A00;
    public String A01;
    public String A02;
    public List A03;
    public final long A04;
    public final EnumC53356Nj7 A05;
    public final C0JO A06;
    public final C18920wW A07;
    public final String A08 = AbstractC167017dG.A0j();
    public final boolean A09;

    public final void A03() {
        InterfaceC02590Ai A0f = AbstractC166987dD.A0f(this.A07, "place_picker_started");
        if (A0f.isSampled()) {
            A0f.AAP("place_picker_session_id", this.A08);
            MSW.A1M(this.A05, A0f);
            A0f.AAP("search_type", "ig_default");
            Boolean bool = this.A00;
            if (bool != null) {
                A0f.A7v("has_location_services", bool);
            }
            A0f.Cht();
        }
    }

    public C52452NIw(C0JO c0jo, InterfaceC11380iw interfaceC11380iw, UserSession userSession, Integer num, boolean z) {
        EnumC53356Nj7 enumC53356Nj7;
        this.A06 = c0jo;
        this.A09 = z;
        this.A04 = c0jo.now();
        int intValue = num.intValue();
        if (intValue != 1) {
            if (intValue != 0) {
                if (intValue == 2) {
                    enumC53356Nj7 = EnumC53356Nj7.IG_POST_SKITTLES;
                }
            } else {
                enumC53356Nj7 = EnumC53356Nj7.IG_STORY;
            }
            this.A05 = enumC53356Nj7;
            this.A01 = "";
            this.A02 = "";
            this.A03 = new LinkedList();
            this.A07 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
        }
        enumC53356Nj7 = EnumC53356Nj7.IG_POST;
        this.A05 = enumC53356Nj7;
        this.A01 = "";
        this.A02 = "";
        this.A03 = new LinkedList();
        this.A07 = AbstractC12220kQ.A01(interfaceC11380iw, userSession);
    }
}
