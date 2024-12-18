package X;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;

/* renamed from: X.G4q, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36415G4q implements InterfaceC165327aL {
    public WDF A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final WeakReference A03;
    public final InterfaceC08830cm A04;
    public final InterfaceC08830cm A05;
    public final InterfaceC08830cm A06;
    public final InterfaceC08830cm A07;
    public final InterfaceC08830cm A08;

    public C36415G4q(FragmentActivity fragmentActivity, InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC08830cm interfaceC08830cm, InterfaceC08830cm interfaceC08830cm2, InterfaceC08830cm interfaceC08830cm3, InterfaceC08830cm interfaceC08830cm4, InterfaceC08830cm interfaceC08830cm5) {
        AbstractC167007dF.A1G(interfaceC08830cm, 3, interfaceC08830cm3);
        AbstractC167007dF.A1I(interfaceC11380iw, 7, interfaceC08830cm5);
        this.A02 = userSession;
        this.A05 = interfaceC08830cm;
        this.A06 = interfaceC08830cm2;
        this.A07 = interfaceC08830cm3;
        this.A04 = interfaceC08830cm4;
        this.A01 = interfaceC11380iw;
        this.A08 = interfaceC08830cm5;
        this.A03 = AbstractC25225BEi.A16(fragmentActivity);
    }

    public static final void A00(C36415G4q c36415G4q) {
        String A07;
        WDF wdf;
        C7U0 c7u0 = (C7U0) AbstractC31172DnG.A0y(c36415G4q.A05);
        Activity activity = (Activity) c36415G4q.A03.get();
        if (activity != null) {
            InterfaceC163837Ux C7r = c7u0.C7r();
            C7TT C7W = C7r.C7W();
            UserSession userSession = c36415G4q.A02;
            if (!C35244Fgd.A03(activity, activity, c36415G4q.A01, userSession, null, C7r.C7E(C7W.A0w), false) && (wdf = c36415G4q.A00) != null) {
                wdf.A02(AbstractC167007dF.A1W(C7W.A0E));
            }
            InterfaceC83733oI CCa = C7r.CCa();
            if (CCa != null && (A07 = AbstractC1345466e.A07(CCa)) != null) {
                AbstractC68473VSe.A00(EnumC33493ErS.CHANGE_PHOTO, VHh.START, userSession, A07);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    public static final void A01(C36415G4q c36415G4q) {
        String A07;
        C7U0 c7u0 = (C7U0) c36415G4q.A05.get();
        Activity activity = (Activity) c36415G4q.A03.get();
        if (activity != null) {
            UserSession userSession = c36415G4q.A02;
            C14360o3.A0A(c7u0);
            C32056E6i A00 = C35252Fgl.A00(null, userSession, c7u0);
            Bundle A0D = AbstractC31174DnI.A0D(userSession);
            EMZ emz = new EMZ();
            emz.setArguments(A0D);
            C7TQ C78 = c7u0.C78();
            String A002 = AbstractC43591JPw.A00(174);
            C14360o3.A0B(C78, 0);
            emz.A02 = C78;
            emz.A01 = A00;
            emz.A03 = A002;
            AbstractC31173DnH.A0w(activity, emz, AbstractC25225BEi.A0y(userSession));
            InterfaceC83733oI CCa = c7u0.C7r().CCa();
            if (CCa != null && (A07 = AbstractC1345466e.A07(CCa)) != null) {
                AbstractC68473VSe.A00(EnumC33493ErS.CHANGE_THREAD_NAME, VHh.START, userSession, A07);
                return;
            }
            throw AbstractC166997dE.A0g();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x00c6, code lost:
    
        if (r4.CVY() == false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0181, code lost:
    
        if (X.C18U.A05(X.C06090Tz.A05, r5) == false) goto L73;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x015b, code lost:
    
        if (r12 != false) goto L45;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0174  */
    @Override // X.InterfaceC165327aL
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C51753Mtc BAd() {
        /*
            Method dump skipped, instructions count: 425
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36415G4q.BAd():X.Mtc");
    }

    @Override // X.InterfaceC165327aL
    public final void FD7(Intent intent) {
        String str;
        String str2;
        if (intent.getAction() != null) {
            try {
                String action = intent.getAction();
                if (action != null) {
                    android.net.Uri A0B = AbstractC25227BEk.A0B(action);
                    if (A0B.getScheme() == null) {
                        A0B = AbstractC08820cl.A03(AnonymousClass001.A0R("file://", intent.getAction()));
                    }
                    WDF wdf = this.A00;
                    if (wdf != null) {
                        wdf.A01(A0B);
                        return;
                    } else {
                        C0w9.A06("UpdateGroupPhotoController Null", "UpdateGroupPhotoController became null", null);
                        return;
                    }
                }
                throw AbstractC166997dE.A0g();
            } catch (NullPointerException e) {
                e = e;
                str = "Null URI";
                str2 = "Uri is null";
                C0w9.A06(str, str2, e);
            } catch (SecurityException e2) {
                e = e2;
                str = "Illegal URI";
                str2 = "Uri is not in correct format";
                C0w9.A06(str, str2, e);
            } catch (Exception e3) {
                String A00 = AbstractC43591JPw.A00(283);
                C0w9.A06(A00, A00, e3);
            }
        }
    }
}
