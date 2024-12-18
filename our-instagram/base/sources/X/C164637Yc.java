package X;

import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.7Yc, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C164637Yc {
    public int A00;
    public final Fragment A01;
    public final InterfaceC41501vz A02;
    public final UserSession A03;
    public final C164477Xm A04;
    public final InterfaceC16820sZ A05;
    public final C7XI A06;

    public C164637Yc(Fragment fragment, UserSession userSession, C7XI c7xi, C164477Xm c164477Xm, InterfaceC16820sZ interfaceC16820sZ) {
        C14360o3.A0B(fragment, 1);
        C14360o3.A0B(c164477Xm, 3);
        C14360o3.A0B(c7xi, 4);
        C14360o3.A0B(interfaceC16820sZ, 5);
        this.A01 = fragment;
        this.A03 = userSession;
        this.A04 = c164477Xm;
        this.A06 = c7xi;
        this.A05 = interfaceC16820sZ;
        this.A02 = new InterfaceC41501vz() { // from class: X.7Yd
            @Override // X.InterfaceC41501vz
            public final /* bridge */ /* synthetic */ void onEvent(Object obj) {
                int A03 = C0f9.A03(1696495294);
                C161037Jm c161037Jm = (C161037Jm) obj;
                int A032 = C0f9.A03(41227817);
                C14360o3.A0B(c161037Jm, 0);
                C164637Yc c164637Yc = C164637Yc.this;
                String C7I = ((C7U0) c164637Yc.A05.invoke()).C7r().C7I();
                if (C7I != null && C14360o3.A0K(c161037Jm.A01, C7I)) {
                    C164637Yc.A00(c164637Yc, c161037Jm.A00);
                }
                C0f9.A0A(-753886447, A032);
                C0f9.A0A(1487385390, A03);
            }
        };
    }

    public static final void A00(C164637Yc c164637Yc, int i) {
        if (c164637Yc.A00 != i) {
            c164637Yc.A00 = i;
            ((C7U0) c164637Yc.A05.invoke()).BDF().DO8(i);
            C7XI c7xi = c164637Yc.A06;
            C160847Is c160847Is = c7xi.A01;
            if (c160847Is != null) {
                String str = c160847Is.A0J;
                CharSequence charSequence = c160847Is.A0G;
                InterfaceC83733oI interfaceC83733oI = c160847Is.A0C;
                boolean z = c160847Is.A0m;
                boolean z2 = c160847Is.A0s;
                boolean z3 = c160847Is.A0N;
                boolean z4 = c160847Is.A0h;
                boolean z5 = c160847Is.A0M;
                boolean z6 = c160847Is.A0U;
                boolean z7 = c160847Is.A0X;
                Reel reel = c160847Is.A0D;
                boolean z8 = c160847Is.A0Y;
                C3AY c3ay = c160847Is.A09;
                List list = c160847Is.A0K;
                boolean z9 = c160847Is.A0c;
                boolean z10 = c160847Is.A0o;
                boolean z11 = c160847Is.A0i;
                boolean z12 = c160847Is.A0e;
                boolean z13 = c160847Is.A0g;
                boolean z14 = c160847Is.A0f;
                boolean z15 = c160847Is.A0p;
                boolean z16 = c160847Is.A0k;
                boolean z17 = c160847Is.A0r;
                User user = c160847Is.A0E;
                MessagingUser messagingUser = c160847Is.A0B;
                boolean z18 = c160847Is.A0j;
                int i2 = c160847Is.A07;
                int i3 = c160847Is.A00;
                int i4 = c160847Is.A03;
                int i5 = c160847Is.A01;
                int i6 = c160847Is.A02;
                boolean z19 = c160847Is.A0x;
                boolean z20 = c160847Is.A0l;
                int i7 = c160847Is.A04;
                boolean z21 = c160847Is.A0S;
                int i8 = c160847Is.A08;
                boolean z22 = c160847Is.A0a;
                boolean z23 = c160847Is.A0Z;
                boolean z24 = c160847Is.A0n;
                C206419By c206419By = c160847Is.A0A;
                boolean z25 = c160847Is.A0V;
                boolean z26 = c160847Is.A0T;
                boolean z27 = c160847Is.A0O;
                boolean z28 = c160847Is.A0L;
                boolean z29 = c160847Is.A0d;
                boolean z30 = c160847Is.A0b;
                boolean z31 = c160847Is.A0Q;
                boolean z32 = c160847Is.A0W;
                boolean z33 = c160847Is.A0w;
                boolean z34 = c160847Is.A0R;
                boolean z35 = c160847Is.A0u;
                boolean z36 = c160847Is.A0v;
                boolean z37 = c160847Is.A0t;
                int i9 = c160847Is.A06;
                boolean z38 = c160847Is.A0q;
                Integer num = c160847Is.A0I;
                Integer num2 = c160847Is.A0H;
                boolean z39 = c160847Is.A0P;
                CharSequence charSequence2 = c160847Is.A0F;
                C14360o3.A0B(str, 0);
                C14360o3.A0B(c3ay, 12);
                C14360o3.A0B(list, 13);
                c7xi.A02(new C160847Is(c3ay, c206419By, messagingUser, interfaceC83733oI, reel, user, charSequence, charSequence2, num, num2, str, list, i2, i3, i4, i5, i6, i, i7, i8, i9, z, z2, z3, z4, z5, z6, z7, z8, z9, z10, z11, z12, z13, z14, z15, z16, z17, z18, z19, z20, z21, z22, z23, z24, z25, z26, z27, z28, z29, z30, z31, z32, z33, z34, z35, z36, z37, z38, z39));
            }
        }
    }
}
