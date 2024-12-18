package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: X.FxS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36154FxS implements InterfaceC41501vz {
    public final /* synthetic */ long A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ C31195Dne A02;
    public final /* synthetic */ C25671My A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C141586ab A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ ArrayList A07;

    public C36154FxS(FragmentActivity fragmentActivity, C31195Dne c31195Dne, C25671My c25671My, UserSession userSession, C141586ab c141586ab, String str, ArrayList arrayList, long j) {
        this.A02 = c31195Dne;
        this.A00 = j;
        this.A03 = c25671My;
        this.A04 = userSession;
        this.A01 = fragmentActivity;
        this.A05 = c141586ab;
        this.A07 = arrayList;
        this.A06 = str;
    }

    @Override // X.InterfaceC41501vz
    public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
        int i;
        int A03 = C0f9.A03(-630572099);
        int A032 = C0f9.A03(1931553965);
        long seconds = TimeUnit.MILLISECONDS.toSeconds(System.currentTimeMillis() - this.A00);
        if (((C3DH) obj).A01 && seconds <= 1) {
            i = 324553327;
        } else {
            this.A03.A02(this, C3DH.class);
            if (seconds > 5) {
                i = 1175270136;
            } else {
                C31195Dne c31195Dne = this.A02;
                UserSession userSession = this.A04;
                C31195Dne.A00(this.A01, c31195Dne, userSession, this.A05, this.A06, this.A07);
                i = -1846586659;
            }
        }
        C0f9.A0A(i, A032);
        C0f9.A0A(1328376068, A03);
    }
}
