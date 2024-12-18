package X;

import android.content.Context;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.LgD, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C48683LgD implements InterfaceC50491MQt {
    public final Context A00;
    public final UserSession A01;
    public final C163997Vo A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC50491MQt
    public final void DmN(Medium medium, String str) {
    }

    @Override // X.InterfaceC50491MQt
    public final EnumC188968Ym B9N() {
        if (this.A04) {
            return EnumC188968Ym.A02;
        }
        return EnumC188968Ym.A04;
    }

    @Override // X.InterfaceC50491MQt
    public final void CoY() {
        UserSession userSession = this.A01;
        if (!AbstractC31172DnG.A1a(AbstractC166987dD.A0x(userSession), "has_seen_multi_modal_ai_nux") && this.A03) {
            AbstractC167007dF.A17(AbstractC31176DnK.A0e(userSession), "has_seen_multi_modal_ai_nux");
            AbstractC35257Fgr.A04(this.A00, userSession);
        }
    }

    @Override // X.InterfaceC50491MQt
    public final void DkK(int i) {
        C7IY c7iy;
        int i2;
        List A11;
        if (C18U.A06(C06090Tz.A05, this.A01, 36320455363142148L)) {
            C7W4 A01 = AnonymousClass983.A01(this.A02.A00);
            if (i == 1) {
                c7iy = A01.A0A;
                if (c7iy != null) {
                    i2 = 21;
                    A11 = AbstractC43594JPz.A0z(i2);
                }
                C14360o3.A0F("messageListAdapterHolder");
                throw C00O.createAndThrow();
            }
            c7iy = A01.A0A;
            if (i >= 4) {
                if (c7iy != null) {
                    A11 = AbstractC43594JPz.A11(93, 188);
                }
            } else if (c7iy != null) {
                i2 = 92;
                A11 = AbstractC43594JPz.A0z(i2);
            }
            C14360o3.A0F("messageListAdapterHolder");
            throw C00O.createAndThrow();
            c7iy.E5M(A11);
        }
    }

    public C48683LgD(Context context, UserSession userSession, C163997Vo c163997Vo, boolean z, boolean z2) {
        AbstractC167017dG.A1Q(context, c163997Vo);
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = c163997Vo;
        this.A04 = z;
        this.A03 = z2;
    }
}
