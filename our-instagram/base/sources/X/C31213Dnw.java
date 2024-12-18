package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.EnumSet;

/* renamed from: X.Dnw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31213Dnw implements InterfaceC55202gL {
    public static final EnumSet A04 = EnumSet.of(EnumC55212gM.A1T, EnumC55212gM.A18, EnumC55212gM.A25, EnumC55212gM.A3K, EnumC55212gM.A3L, EnumC55212gM.A1i, EnumC55212gM.A0b);
    public WeakReference A00;
    public final UserSession A01;
    public final String A02;
    public final EnumSet A03;

    @Override // X.InterfaceC55202gL
    public final GYB BAv(EnumC55212gM enumC55212gM) {
        GYB p7h;
        FragmentActivity fragmentActivity = (FragmentActivity) this.A00.get();
        if (fragmentActivity == null) {
            AbstractC54912fq.A00();
            AbstractC31211Dnu.A00(this.A01);
        } else {
            if (enumC55212gM == null) {
                enumC55212gM = EnumC55212gM.A1T;
            }
            switch (FED.A00[enumC55212gM.ordinal()]) {
                case 1:
                    p7h = new GDC(fragmentActivity, this.A01);
                    break;
                case 2:
                    p7h = new C36659GEf(fragmentActivity, AbstractC018607g.A00(fragmentActivity), this.A01);
                    break;
                case 3:
                case 4:
                    p7h = new C36666GEm(fragmentActivity, this.A01, this.A02);
                    break;
                case 5:
                    p7h = new GDZ(fragmentActivity, this.A01);
                    break;
                case 6:
                    p7h = new P7H(fragmentActivity, this.A01);
                    break;
                case 7:
                    break;
                default:
                    throw AbstractC166987dD.A12(AbstractC167017dG.A0n(enumC55212gM, "Don't have a handler for ", AbstractC166987dD.A1C()));
            }
            return p7h;
        }
        return null;
    }

    public C31213Dnw(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession) {
        this.A01 = userSession;
        this.A02 = interfaceC11380iw.getModuleName();
        this.A00 = AbstractC25225BEi.A16(fragmentActivity);
        EnumSet enumSet = A04;
        C14360o3.A08(enumSet);
        this.A03 = enumSet;
    }

    @Override // X.InterfaceC55202gL
    public final EnumSet C4E() {
        return this.A03;
    }
}
