package X;

import com.instagram.business.boost.mediapicker.model.BoostMediaPickerTabType;
import com.instagram.common.session.UserSession;
import java.util.List;
import java.util.Map;

/* renamed from: X.Jmo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44544Jmo extends AbstractC52922bZ {
    public final C05A A00;
    public final C0UO A01;
    public final UserSession A02;
    public final String A03;
    public final Map A04;

    public final C44523JmT A02(BoostMediaPickerTabType boostMediaPickerTabType) {
        C14360o3.A0B(boostMediaPickerTabType, 0);
        Map map = this.A04;
        C44523JmT c44523JmT = (C44523JmT) map.get(boostMediaPickerTabType);
        if (c44523JmT == null) {
            UserSession userSession = this.A02;
            c44523JmT = new C44523JmT(boostMediaPickerTabType, new KZN(userSession), userSession, this.A03);
        }
        map.put(boostMediaPickerTabType, c44523JmT);
        AbstractC166987dD.A1Z(new MCK(c44523JmT, this, (InterfaceC23621Ds) null, 7), AbstractC141776au.A00(this));
        return c44523JmT;
    }

    public final void A04(EnumC68121VCe enumC68121VCe) {
        int A05 = AbstractC25227BEk.A05(enumC68121VCe, 0);
        int i = 2;
        if (A05 != 0) {
            if (A05 != 1) {
                throw B4Z.A00();
            }
        } else {
            i = 1;
        }
        C70399WUb.A00(this.A02).A0S(VG4.A11.toString(), AnonymousClass001.A0O("start_media_selection_", i));
    }

    public static final C44523JmT A00(C44544Jmo c44544Jmo) {
        C44523JmT c44523JmT = (C44523JmT) c44544Jmo.A04.get(c44544Jmo.A01());
        if (c44523JmT == null) {
            return c44544Jmo.A02(c44544Jmo.A01());
        }
        return c44523JmT;
    }

    public final BoostMediaPickerTabType A01() {
        Object obj;
        C45124Jxt c45124Jxt = (C45124Jxt) this.A01.getValue();
        int ordinal = ((EnumC68121VCe) c45124Jxt.A05).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                obj = c45124Jxt.A03;
            } else {
                throw B4Z.A00();
            }
        } else {
            obj = c45124Jxt.A04;
        }
        return (BoostMediaPickerTabType) obj;
    }

    public final List A03() {
        int ordinal = ((EnumC68121VCe) ((C45124Jxt) this.A01.getValue()).A05).ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return AbstractC166987dD.A1J(BoostMediaPickerTabType.A05);
            }
            throw B4Z.A00();
        }
        return AbstractC16960so.A1Q(BoostMediaPickerTabType.A04, BoostMediaPickerTabType.A06, BoostMediaPickerTabType.A03);
    }

    public C44544Jmo(EnumC68121VCe enumC68121VCe, UserSession userSession, String str) {
        AbstractC167027dH.A13(userSession, str, enumC68121VCe);
        this.A02 = userSession;
        this.A03 = str;
        C008002u A1H = AbstractC25225BEi.A1H(new C45124Jxt(enumC68121VCe));
        this.A00 = A1H;
        this.A01 = AbstractC208910l.A02(A1H);
        this.A04 = AbstractC166987dD.A1I();
    }

    public final void A05(EnumC68121VCe enumC68121VCe) {
        Object value;
        C45124Jxt c45124Jxt;
        A04(enumC68121VCe);
        C05A c05a = this.A00;
        do {
            value = c05a.getValue();
            c45124Jxt = (C45124Jxt) value;
        } while (!c05a.AIi(value, C45124Jxt.A01((BoostMediaPickerTabType) c45124Jxt.A04, (BoostMediaPickerTabType) c45124Jxt.A03, enumC68121VCe, false, c45124Jxt.A01)));
        A00(this).A00();
    }
}
