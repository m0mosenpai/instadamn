package X;

import android.app.Activity;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.facebook.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.clips.intf.ClipsWatchAndBrowseData;
import com.instagram.common.session.UserSession;
import com.instagram.creation.cameraconfiguration.CameraConfiguration;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.ui.swipenavigation.PositionConfig;
import com.instagram.ui.swipenavigation.SwipeNavigationContainer;
import java.lang.ref.WeakReference;
import java.util.EnumSet;
import java.util.Stack;

/* renamed from: X.2fd, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C54802fd implements InterfaceC53892dT, C2fe {
    public float A01;
    public float A02;
    public long A04;
    public long A05;
    public Pair A06;
    public MotionEvent A07;
    public View A08;
    public View A09;
    public View A0A;
    public View A0B;
    public AbstractC59962oe A0C;
    public C120985dq A0D;
    public C23476Aap A0E;
    public SwipeNavigationContainer A0F;
    public C59872oU A0G;
    public String A0H;
    public WeakReference A0I;
    public WeakReference A0J;
    public WeakReference A0K;
    public WeakReference A0L;
    public boolean A0M;
    public WeakReference A0N;
    public final FragmentActivity A0O;
    public final UserSession A0P;
    public final C54762fZ A0Q;
    public final C54832fh A0R;
    public final C54822fg A0S;
    public final EnumSet A0T = EnumSet.noneOf(EnumC54812ff.class);
    public int A03 = 0;
    public float A00 = 0.0f;

    public final void A0D(EnumC54812ff enumC54812ff, String str) {
        A06(this, enumC54812ff, false, str);
    }

    public static Fragment A00(C54802fd c54802fd) {
        WeakReference weakReference = c54802fd.A0N;
        if (weakReference == null) {
            return null;
        }
        return (Fragment) weakReference.get();
    }

    public static UserDetailFragment A01(C54802fd c54802fd) {
        WeakReference weakReference = c54802fd.A0K;
        if (weakReference == null) {
            return null;
        }
        return (UserDetailFragment) weakReference.get();
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0031, code lost:
    
        if ((r1 instanceof X.C59952od) != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C59952od A02(X.C54802fd r2) {
        /*
            X.2fZ r1 = r2.A0Q
            X.1QO r0 = X.C1QO.A0C
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L38
            java.lang.String r1 = "fragment_feed"
        Lc:
            androidx.fragment.app.FragmentActivity r0 = r2.A0O
            X.0h2 r0 = r0.getSupportFragmentManager()
            androidx.fragment.app.Fragment r0 = r0.A0Q(r1)
            if (r0 == 0) goto L36
            X.0h2 r0 = r0.getChildFragmentManager()
            X.06g r0 = r0.A0U
            java.util.List r1 = r0.A04()
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L36
            r0 = 0
            java.lang.Object r1 = r1.get(r0)
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            boolean r0 = r1 instanceof X.C59952od
            if (r0 == 0) goto L36
        L33:
            X.2od r1 = (X.C59952od) r1
            return r1
        L36:
            r1 = 0
            goto L33
        L38:
            X.1QO r0 = X.C1QO.A0F
            boolean r0 = r1.A0B(r0)
            if (r0 == 0) goto L43
            java.lang.String r1 = "fragment_search"
            goto Lc
        L43:
            java.lang.String r1 = "fragment_clips"
            goto Lc
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802fd.A02(X.2fd):X.2od");
    }

    public static void A04(final AbstractC10360h2 abstractC10360h2, final C54802fd c54802fd, final int i, final boolean z, boolean z2) {
        WeakReference weakReference;
        if (!abstractC10360h2.A0G && c54802fd.A0F != null) {
            C14240no c14240no = new C14240no(abstractC10360h2);
            if ((i & 1) > 0) {
                c54802fd.A05(c14240no, C1QO.A09);
            }
            if ((i & 16) > 0) {
                c54802fd.A05(c14240no, C1QO.A0F);
            }
            if ((i & 64) > 0) {
                c54802fd.A05(c14240no, C1QO.A0E);
            }
            if ((i & 128) > 0) {
                c54802fd.A05(c14240no, C1QO.A0B);
            }
            AbstractC59962oe abstractC59962oe = c54802fd.A0C;
            if (abstractC59962oe != null && (i & 2) > 0 && (c54802fd.A0G() || z)) {
                c14240no.A03(abstractC59962oe);
                c54802fd.A0C = null;
                c54802fd.A0T.remove(EnumC54812ff.A07);
            }
            C207549Gh A0A = c54802fd.A0A();
            if (A0A != null && (i & 4) > 0 && (c54802fd.A0I() || z)) {
                c14240no.A03(A0A);
                c54802fd.A0J = null;
                c54802fd.A0T.remove(EnumC54812ff.A05);
            }
            if ((i & 8) > 0) {
                if (A01(c54802fd) != null && (!c54802fd.A0H() || z)) {
                    c14240no.A03(A01(c54802fd));
                    c54802fd.A0K = null;
                    c54802fd.A0D = null;
                    c54802fd.A0T.remove(EnumC54812ff.A08);
                } else {
                    WeakReference weakReference2 = c54802fd.A0L;
                    if (weakReference2 != null && weakReference2.get() != null && (!c54802fd.A0H() || z)) {
                        c14240no.A03((Fragment) weakReference2.get());
                        c54802fd.A0L = null;
                        c54802fd.A0D = null;
                        c54802fd.A0T.remove(EnumC54812ff.A08);
                    }
                }
            }
            if ((i & 256) > 0 && A00(c54802fd) != null) {
                c14240no.A03(A00(c54802fd));
                c54802fd.A0N = null;
                c54802fd.A0D = null;
                c54802fd.A0T.remove(EnumC54812ff.A06);
            }
            if ((i & 512) > 0 && (weakReference = c54802fd.A0I) != null && weakReference.get() != null) {
                c14240no.A03((Fragment) weakReference.get());
                c54802fd.A0I = null;
                c54802fd.A0D = null;
                c54802fd.A0T.remove(EnumC54812ff.A09);
            }
            if (!c14240no.A0B.isEmpty()) {
                try {
                    if (C18U.A06(C06090Tz.A06, c54802fd.A0P, 36317517611668809L)) {
                        c14240no.A01();
                    } else {
                        c14240no.A06();
                    }
                } catch (IllegalStateException e) {
                    if (z2) {
                        C0w9.A06("destroyInactiveSwipeFragments", "Exception during transaction commit", e);
                    } else {
                        C11T.A04(new Runnable() { // from class: X.GQT
                            @Override // java.lang.Runnable
                            public final void run() {
                                C54802fd.A04(abstractC10360h2, c54802fd, i, z, true);
                            }
                        }, 1500L);
                    }
                }
            }
        }
    }

    private void A05(AbstractC016706m abstractC016706m, C1QO c1qo) {
        Fragment A0Q;
        if (this.A0F.getPosition() == 0.0f && this.A0Q.A0B(c1qo)) {
            return;
        }
        String str = c1qo.A04;
        FragmentActivity fragmentActivity = this.A0O;
        Fragment A0Q2 = fragmentActivity.getSupportFragmentManager().A0Q(str);
        if (A0Q2 == null || A0Q2.getChildFragmentManager().A0Q(str) == null || (A0Q = fragmentActivity.getSupportFragmentManager().A0Q(str)) == null) {
            return;
        }
        abstractC016706m.A03(A0Q);
    }

    /* JADX WARN: Code restructure failed: missing block: B:175:0x0163, code lost:
    
        if (r12 == false) goto L75;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:80:0x01b8. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03fc  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x047a A[Catch: all -> 0x0497, TryCatch #0 {all -> 0x0497, blocks: (B:6:0x0019, B:8:0x0023, B:10:0x002b, B:12:0x0053, B:14:0x005b, B:15:0x0068, B:17:0x006c, B:19:0x0072, B:21:0x0088, B:22:0x00a3, B:24:0x00a9, B:26:0x00b1, B:27:0x00bd, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:35:0x00de, B:37:0x00e6, B:39:0x00ea, B:40:0x00f4, B:42:0x00fc, B:45:0x0107, B:47:0x010f, B:49:0x0115, B:50:0x0127, B:51:0x0120, B:54:0x0134, B:58:0x0147, B:60:0x014f, B:62:0x0165, B:64:0x016d, B:66:0x0175, B:69:0x0185, B:71:0x018b, B:74:0x0193, B:76:0x0199, B:77:0x01a5, B:78:0x01af, B:80:0x01b8, B:81:0x01bb, B:82:0x01c2, B:84:0x01ef, B:86:0x0204, B:87:0x02f1, B:88:0x0414, B:90:0x0428, B:91:0x042b, B:92:0x042f, B:93:0x020f, B:94:0x021a, B:97:0x0223, B:100:0x0233, B:102:0x0257, B:103:0x025f, B:106:0x0472, B:108:0x047a, B:110:0x0480, B:111:0x0490, B:112:0x026c, B:115:0x0275, B:118:0x0280, B:120:0x0296, B:122:0x02ac, B:123:0x02f6, B:125:0x02fe, B:126:0x031d, B:128:0x0367, B:130:0x037b, B:132:0x038b, B:134:0x039f, B:137:0x03b4, B:138:0x03bb, B:139:0x03b7, B:141:0x03c6, B:143:0x03e3, B:146:0x03f6, B:147:0x03fd, B:150:0x01c7, B:153:0x01d1, B:156:0x01db, B:159:0x01e5, B:162:0x0433, B:164:0x0442, B:166:0x0448, B:168:0x045d, B:170:0x046a, B:172:0x0157, B:173:0x015e, B:176:0x013f, B:179:0x0033, B:181:0x0039, B:183:0x0043), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018b A[Catch: all -> 0x0497, TryCatch #0 {all -> 0x0497, blocks: (B:6:0x0019, B:8:0x0023, B:10:0x002b, B:12:0x0053, B:14:0x005b, B:15:0x0068, B:17:0x006c, B:19:0x0072, B:21:0x0088, B:22:0x00a3, B:24:0x00a9, B:26:0x00b1, B:27:0x00bd, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:35:0x00de, B:37:0x00e6, B:39:0x00ea, B:40:0x00f4, B:42:0x00fc, B:45:0x0107, B:47:0x010f, B:49:0x0115, B:50:0x0127, B:51:0x0120, B:54:0x0134, B:58:0x0147, B:60:0x014f, B:62:0x0165, B:64:0x016d, B:66:0x0175, B:69:0x0185, B:71:0x018b, B:74:0x0193, B:76:0x0199, B:77:0x01a5, B:78:0x01af, B:80:0x01b8, B:81:0x01bb, B:82:0x01c2, B:84:0x01ef, B:86:0x0204, B:87:0x02f1, B:88:0x0414, B:90:0x0428, B:91:0x042b, B:92:0x042f, B:93:0x020f, B:94:0x021a, B:97:0x0223, B:100:0x0233, B:102:0x0257, B:103:0x025f, B:106:0x0472, B:108:0x047a, B:110:0x0480, B:111:0x0490, B:112:0x026c, B:115:0x0275, B:118:0x0280, B:120:0x0296, B:122:0x02ac, B:123:0x02f6, B:125:0x02fe, B:126:0x031d, B:128:0x0367, B:130:0x037b, B:132:0x038b, B:134:0x039f, B:137:0x03b4, B:138:0x03bb, B:139:0x03b7, B:141:0x03c6, B:143:0x03e3, B:146:0x03f6, B:147:0x03fd, B:150:0x01c7, B:153:0x01d1, B:156:0x01db, B:159:0x01e5, B:162:0x0433, B:164:0x0442, B:166:0x0448, B:168:0x045d, B:170:0x046a, B:172:0x0157, B:173:0x015e, B:176:0x013f, B:179:0x0033, B:181:0x0039, B:183:0x0043), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0428 A[Catch: all -> 0x0497, TryCatch #0 {all -> 0x0497, blocks: (B:6:0x0019, B:8:0x0023, B:10:0x002b, B:12:0x0053, B:14:0x005b, B:15:0x0068, B:17:0x006c, B:19:0x0072, B:21:0x0088, B:22:0x00a3, B:24:0x00a9, B:26:0x00b1, B:27:0x00bd, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:35:0x00de, B:37:0x00e6, B:39:0x00ea, B:40:0x00f4, B:42:0x00fc, B:45:0x0107, B:47:0x010f, B:49:0x0115, B:50:0x0127, B:51:0x0120, B:54:0x0134, B:58:0x0147, B:60:0x014f, B:62:0x0165, B:64:0x016d, B:66:0x0175, B:69:0x0185, B:71:0x018b, B:74:0x0193, B:76:0x0199, B:77:0x01a5, B:78:0x01af, B:80:0x01b8, B:81:0x01bb, B:82:0x01c2, B:84:0x01ef, B:86:0x0204, B:87:0x02f1, B:88:0x0414, B:90:0x0428, B:91:0x042b, B:92:0x042f, B:93:0x020f, B:94:0x021a, B:97:0x0223, B:100:0x0233, B:102:0x0257, B:103:0x025f, B:106:0x0472, B:108:0x047a, B:110:0x0480, B:111:0x0490, B:112:0x026c, B:115:0x0275, B:118:0x0280, B:120:0x0296, B:122:0x02ac, B:123:0x02f6, B:125:0x02fe, B:126:0x031d, B:128:0x0367, B:130:0x037b, B:132:0x038b, B:134:0x039f, B:137:0x03b4, B:138:0x03bb, B:139:0x03b7, B:141:0x03c6, B:143:0x03e3, B:146:0x03f6, B:147:0x03fd, B:150:0x01c7, B:153:0x01d1, B:156:0x01db, B:159:0x01e5, B:162:0x0433, B:164:0x0442, B:166:0x0448, B:168:0x045d, B:170:0x046a, B:172:0x0157, B:173:0x015e, B:176:0x013f, B:179:0x0033, B:181:0x0039, B:183:0x0043), top: B:5:0x0019 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x042f A[Catch: all -> 0x0497, TryCatch #0 {all -> 0x0497, blocks: (B:6:0x0019, B:8:0x0023, B:10:0x002b, B:12:0x0053, B:14:0x005b, B:15:0x0068, B:17:0x006c, B:19:0x0072, B:21:0x0088, B:22:0x00a3, B:24:0x00a9, B:26:0x00b1, B:27:0x00bd, B:29:0x00c5, B:31:0x00cb, B:33:0x00da, B:35:0x00de, B:37:0x00e6, B:39:0x00ea, B:40:0x00f4, B:42:0x00fc, B:45:0x0107, B:47:0x010f, B:49:0x0115, B:50:0x0127, B:51:0x0120, B:54:0x0134, B:58:0x0147, B:60:0x014f, B:62:0x0165, B:64:0x016d, B:66:0x0175, B:69:0x0185, B:71:0x018b, B:74:0x0193, B:76:0x0199, B:77:0x01a5, B:78:0x01af, B:80:0x01b8, B:81:0x01bb, B:82:0x01c2, B:84:0x01ef, B:86:0x0204, B:87:0x02f1, B:88:0x0414, B:90:0x0428, B:91:0x042b, B:92:0x042f, B:93:0x020f, B:94:0x021a, B:97:0x0223, B:100:0x0233, B:102:0x0257, B:103:0x025f, B:106:0x0472, B:108:0x047a, B:110:0x0480, B:111:0x0490, B:112:0x026c, B:115:0x0275, B:118:0x0280, B:120:0x0296, B:122:0x02ac, B:123:0x02f6, B:125:0x02fe, B:126:0x031d, B:128:0x0367, B:130:0x037b, B:132:0x038b, B:134:0x039f, B:137:0x03b4, B:138:0x03bb, B:139:0x03b7, B:141:0x03c6, B:143:0x03e3, B:146:0x03f6, B:147:0x03fd, B:150:0x01c7, B:153:0x01d1, B:156:0x01db, B:159:0x01e5, B:162:0x0433, B:164:0x0442, B:166:0x0448, B:168:0x045d, B:170:0x046a, B:172:0x0157, B:173:0x015e, B:176:0x013f, B:179:0x0033, B:181:0x0039, B:183:0x0043), top: B:5:0x0019 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A06(X.C54802fd r16, X.EnumC54812ff r17, java.lang.Boolean r18, java.lang.String r19) {
        /*
            Method dump skipped, instructions count: 1222
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802fd.A06(X.2fd, X.2ff, java.lang.Boolean, java.lang.String):void");
    }

    private void A07(EnumC54812ff enumC54812ff) {
        WeakReference weakReference;
        Fragment fragment;
        Fragment fragment2;
        AbstractC10360h2 supportFragmentManager = this.A0Q.A08.getSupportFragmentManager();
        C14240no c14240no = new C14240no(supportFragmentManager);
        if (EnumC54812ff.A08.equals(enumC54812ff)) {
            UserDetailFragment A01 = A01(this);
            WeakReference weakReference2 = this.A0L;
            if (weakReference2 == null) {
                fragment2 = null;
            } else {
                fragment2 = (Fragment) weakReference2.get();
            }
            if (A01 != null) {
                c14240no.A03(A01);
                this.A0K = null;
                c14240no.A01();
                supportFragmentManager.A0Z();
                this.A0T.remove(enumC54812ff);
            }
            if (fragment2 != null) {
                c14240no.A03(fragment2);
                this.A0L = null;
            } else {
                return;
            }
        } else if (EnumC54812ff.A06.equals(enumC54812ff)) {
            Fragment A00 = A00(this);
            if (A00 == null) {
                return;
            }
            c14240no.A07(0, R.anim.noop, 0, 0);
            c14240no.A03(A00);
            this.A0N = null;
        } else {
            if (!EnumC54812ff.A09.equals(enumC54812ff) || (weakReference = this.A0I) == null || (fragment = (Fragment) weakReference.get()) == null) {
                return;
            }
            c14240no.A03(fragment);
            this.A0I = null;
        }
        c14240no.A01();
        supportFragmentManager.A0Z();
        this.A0T.remove(enumC54812ff);
    }

    public static boolean A08(C54802fd c54802fd) {
        C120985dq c120985dq = c54802fd.A0D;
        if (c120985dq != null && c120985dq.CdW() && c54802fd.A0D.A06().A0K.A0C.CDj() != null && !c54802fd.A0D.A06().A0K.A0C.CDj().A2N()) {
            if (C5Hu.A00(c54802fd.A0D.A06().A0K.A0C.AqQ(), c54802fd.A0P)) {
                return true;
            }
        }
        return false;
    }

    public final C207549Gh A0A() {
        WeakReference weakReference = this.A0J;
        if (weakReference == null) {
            return null;
        }
        return (C207549Gh) weakReference.get();
    }

    public final String A0B(AbstractC10360h2 abstractC10360h2) {
        float f;
        InterfaceC08430c6 A0O;
        C54822fg c54822fg = this.A0S;
        C54132eL c54132eL = c54822fg.A04;
        float f2 = c54822fg.A01;
        InterfaceC11380iw interfaceC11380iw = this.A0C;
        if (interfaceC11380iw == null || c54132eL.A00(f2) != 1.0f) {
            C207549Gh A0A = A0A();
            if (A0A != null && c54132eL.A01(f2) == 1.0f) {
                return A0A.A0C;
            }
            if (f2 > 0.0f) {
                f = 1.0f - f2;
            } else {
                f = 1.0f + f2;
            }
            if (f == 1.0f) {
                if (abstractC10360h2 == null) {
                    A0O = null;
                } else {
                    A0O = abstractC10360h2.A0O(R.id.layout_container_main);
                }
                if (A0O instanceof InterfaceC11380iw) {
                    interfaceC11380iw = (InterfaceC11380iw) A0O;
                } else {
                    return "main_tab";
                }
            } else {
                return "main_tab";
            }
        }
        return interfaceC11380iw.getModuleName();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A0C(Fragment fragment, final InterfaceC53752dE interfaceC53752dE, final C1QP c1qp) {
        AbstractC59962oe abstractC59962oe;
        CameraConfiguration cameraConfiguration;
        C13080lu A00 = AbstractC13090lv.A00("SwipeNavigationController.onAttachFragment");
        try {
            if (EnumC54812ff.A05.equals(c1qp) && (fragment instanceof C207549Gh)) {
                C207549Gh c207549Gh = (C207549Gh) fragment;
                this.A0J = new WeakReference(c207549Gh);
                UserSession userSession = this.A0P;
                C54822fg c54822fg = this.A0S;
                C23767Afe c23767Afe = new C23767Afe(userSession, interfaceC53752dE, c54822fg);
                C23476Aap c23476Aap = new C23476Aap((ViewGroup) this.A0O.getWindow().getDecorView(), c23767Afe);
                this.A0E = c23476Aap;
                C14360o3.A0B(c54822fg, 0);
                c207549Gh.A0A = c54822fg;
                c207549Gh.A07 = c23767Afe;
                c207549Gh.A05 = c23476Aap;
                SwipeNavigationContainer swipeNavigationContainer = this.A0F;
                if (swipeNavigationContainer != null && (cameraConfiguration = swipeNavigationContainer.A0A) != null) {
                    c207549Gh.A04(cameraConfiguration);
                }
            } else if (EnumC54812ff.A07.equals(c1qp)) {
                if (fragment instanceof C60552pe) {
                    abstractC59962oe = (AbstractC59962oe) ((C60552pe) fragment).A02(new InterfaceC16660sJ() { // from class: X.GRn
                        @Override // X.InterfaceC16660sJ
                        public final Object invoke(Object obj) {
                            Fragment fragment2 = (Fragment) obj;
                            this.A0C(fragment2, interfaceC53752dE, c1qp);
                            return null;
                        }
                    });
                } else {
                    abstractC59962oe = (AbstractC59962oe) fragment;
                }
                this.A0C = abstractC59962oe;
                if (abstractC59962oe != null) {
                    if (abstractC59962oe instanceof MPF) {
                        ((MPF) abstractC59962oe).EfG(this);
                    }
                    if (this.A0F != null) {
                        abstractC59962oe.setUserVisibleHint(A0H());
                    }
                }
            } else {
                boolean equals = EnumC54812ff.A08.equals(c1qp);
                if (equals && (fragment instanceof UserDetailFragment)) {
                    this.A0K = new WeakReference((UserDetailFragment) fragment);
                } else if (equals) {
                    this.A0L = new WeakReference(fragment);
                } else if (EnumC54812ff.A06.equals(c1qp)) {
                    this.A0N = new WeakReference(fragment);
                } else if (EnumC54812ff.A09.equals(c1qp)) {
                    this.A0I = new WeakReference(fragment);
                } else if (fragment instanceof InterfaceC59992oh) {
                    InterfaceC59992oh interfaceC59992oh = (InterfaceC59992oh) fragment;
                    final InterfaceC11380iw interfaceC11380iw = (InterfaceC11380iw) fragment;
                    final UserSession userSession2 = this.A0P;
                    final FragmentActivity fragmentActivity = this.A0O;
                    interfaceC59992oh.registerLifecycleListener(new AbstractC60592pi(fragmentActivity, interfaceC11380iw, userSession2) { // from class: X.2ph
                        public final Activity A00;
                        public final InterfaceC11380iw A01;
                        public final UserSession A02;

                        @Override // X.AbstractC60592pi, X.InterfaceC60602pj
                        public final void onCreate() {
                            C13080lu A002 = AbstractC13090lv.A00("SwipeNavigationController.onCreate");
                            try {
                                C55772hI.A00(this.A02).A0B(this.A01);
                                A002.close();
                            } catch (Throwable th) {
                                try {
                                    A002.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        }

                        @Override // X.AbstractC60592pi, X.InterfaceC60602pj
                        public final void onDestroy() {
                            C13080lu A002 = AbstractC13090lv.A00("SwipeNavigationController.onDestroy");
                            try {
                                C55772hI.A00(this.A02).A07(this.A00, this.A01);
                                A002.close();
                            } catch (Throwable th) {
                                try {
                                    A002.close();
                                    throw th;
                                } catch (Throwable th2) {
                                    Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                                    throw th;
                                }
                            }
                        }

                        {
                            this.A02 = userSession2;
                            this.A00 = fragmentActivity;
                            this.A01 = interfaceC11380iw;
                        }
                    });
                }
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0019, code lost:
    
        if (r2 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0E(boolean r20, boolean r21) {
        /*
            r19 = this;
            r4 = r19
            r4.A03()
            if (r20 == 0) goto L10
            com.instagram.common.session.UserSession r0 = r4.A0P
            boolean r0 = X.C59942oc.A0C(r0)
            if (r0 != 0) goto L10
        Lf:
            return
        L10:
            X.5dq r0 = r4.A0D
            r1 = 1
            r6 = 0
            if (r0 == 0) goto L1b
            com.instagram.user.model.User r2 = r0.A0K
            r0 = 1
            if (r2 != 0) goto L1c
        L1b:
            r0 = 0
        L1c:
            X.C18C.A0E(r0)
            com.instagram.common.session.UserSession r5 = r4.A0P
            X.5dq r3 = r4.A0D
            X.3YT r2 = X.C3YS.A00(r5)
            X.C14360o3.A0B(r3, r1)
            r0 = 2
            X.C14360o3.A0B(r2, r0)
            r13 = 0
            X.Ghd r10 = X.AbstractC37652Ghl.A01(r3, r5, r2, r13, r13)
            X.5dq r0 = r4.A0D
            boolean r0 = r0.CdW()
            if (r0 == 0) goto Lf
            X.2od r5 = A02(r4)
            if (r5 == 0) goto Lf
            boolean r0 = r5.isStateSaved()
            if (r0 == 0) goto L4f
            java.lang.String r1 = "openCTA"
            java.lang.String r0 = "Add fragment arguments after fragment state is saved!"
            X.C0w9.A03(r1, r0)
            return
        L4f:
            android.os.Bundle r3 = r5.mArguments
            if (r3 != 0) goto L58
            android.os.Bundle r3 = new android.os.Bundle
            r3.<init>()
        L58:
            r0 = 725(0x2d5, float:1.016E-42)
            java.lang.String r2 = X.AbstractC58317Pt9.A00(r0)
            r3.putBoolean(r2, r1)
            r5.setArguments(r3)
            X.Gfw r0 = r5.A09
            if (r0 != 0) goto L72
            java.lang.String r0 = "clipsViewerFragmentViewModel"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L72:
            X.0do r0 = r0.A1c
            java.lang.Object r7 = r0.getValue()
            X.Dn3 r7 = (X.InterfaceC31159Dn3) r7
            X.5dq r9 = r4.A0D
            r15 = -1082130432(0xffffffffbf800000, float:-1.0)
            X.Ilz r8 = new X.Ilz
            r8.<init>()
            X.2Fb r11 = X.C2Fb.A0v
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r6)
            r18 = r21
            r14 = r13
            r16 = r15
            r17 = r1
            r7.D4v(r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18)
            if (r20 != 0) goto L9b
            boolean r0 = r4.A0K()
            if (r0 == 0) goto Lad
        L9b:
            X.C0b3.A00()
            com.instagram.ui.swipenavigation.SwipeNavigationContainer r0 = r4.A0F
            android.content.Context r1 = r0.getContext()
            androidx.fragment.app.FragmentActivity r0 = r4.A0O
            X.N0X r0 = X.AbstractC53863Nrr.A00(r0)
            X.C0b3.A02(r1, r0)
        Lad:
            r3.remove(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802fd.A0E(boolean, boolean):void");
    }

    public final boolean A0F() {
        int i;
        C81Y c81y;
        C22P c22p;
        InterfaceC08430c6 interfaceC08430c6;
        C207549Gh A0A = A0A();
        if (A0A == null || !A0A.onBackPressed()) {
            InterfaceC08430c6 A00 = A00(this);
            if ((A00 instanceof C172707mf) && A00 == this.A0O.getSupportFragmentManager().A0O(R.id.layout_container_right)) {
                if (!((InterfaceC60072op) A00).onBackPressed()) {
                    A07(EnumC54812ff.A06);
                }
            }
            WeakReference weakReference = this.A0I;
            if (weakReference != null && (interfaceC08430c6 = (Fragment) weakReference.get()) != null && interfaceC08430c6 == this.A0O.getSupportFragmentManager().A0O(R.id.layout_container_right)) {
                if (!((InterfaceC60072op) interfaceC08430c6).onBackPressed()) {
                    A07(EnumC54812ff.A09);
                }
            }
            InterfaceC08430c6 interfaceC08430c62 = this.A0C;
            if (interfaceC08430c62 != null && (interfaceC08430c62 instanceof InterfaceC60072op) && ((InterfaceC60072op) interfaceC08430c62).onBackPressed()) {
                return true;
            }
            if (!this.A0M && (A0A == null || (c81y = A0A.A06) == null || ((c22p = c81y.A00.A0x.A00.A01) != C22P.A3L && c22p != C22P.A3M))) {
                if (this.A0F.getPosition() != 0.0f) {
                    boolean A07 = AbstractC54792fc.A07(this.A0P);
                    FBp(new PositionConfig(null, null, null, "back", null, null, null, null, null, null, null, null, null, 0.0f, 0, !A07));
                    if (A07) {
                        BRS.A00(this.A08);
                        return true;
                    }
                } else {
                    FragmentActivity fragmentActivity = this.A0O;
                    Fragment A0O = fragmentActivity.getSupportFragmentManager().A0O(R.id.layout_container_main);
                    if (A0O != null) {
                        i = A0O.getChildFragmentManager().A0L();
                    } else {
                        i = 0;
                    }
                    if (this.A0K != null && this.A03 == i && A02(this) == null) {
                        if (C18U.A06(C06090Tz.A06, this.A0P, 36317517607867696L)) {
                            FBp(new PositionConfig(null, null, null, "back", null, null, null, null, null, null, null, null, null, 1.0f, 0, false));
                        }
                    }
                    C54762fZ c54762fZ = this.A0Q;
                    Stack stack = c54762fZ.A01.A06;
                    Object obj = null;
                    if (stack.size() > 1) {
                        Object pop = stack.pop();
                        if (!stack.isEmpty()) {
                            obj = stack.peek();
                        }
                        stack.push(pop);
                        if (obj != null) {
                            Stack stack2 = c54762fZ.A01.A06;
                            Object obj2 = null;
                            if (stack2.size() > 1) {
                                Object pop2 = stack2.pop();
                                if (!stack2.isEmpty()) {
                                    obj2 = stack2.peek();
                                }
                                stack2.push(pop2);
                            }
                            if (obj2 == C1QO.A0B && AbstractC54792fc.A07(this.A0P)) {
                                InterfaceC08430c6 A0O2 = fragmentActivity.getSupportFragmentManager().A0O(R.id.layout_container_main);
                                if ((A0O2 instanceof InterfaceC60072op) && ((InterfaceC60072op) A0O2).onBackPressed()) {
                                    return true;
                                }
                                EnumSet enumSet = this.A0T;
                                EnumC54812ff enumC54812ff = EnumC54812ff.A07;
                                if (!enumSet.contains(enumC54812ff)) {
                                    A0D(enumC54812ff, "back");
                                }
                                FBp(new PositionConfig(null, null, null, "back", null, null, null, null, null, null, null, null, null, 1.0f, 0, false));
                                Stack stack3 = c54762fZ.A01.A06;
                                if (stack3.size() > 1) {
                                    stack3.pop();
                                    return true;
                                }
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final boolean A0G() {
        if (this.A0S.A04.A00(this.A0F.getPosition()) != 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean A0H() {
        if (this.A0S.A04.A00(this.A0F.getPosition()) != 1.0f) {
            return false;
        }
        return true;
    }

    public final boolean A0I() {
        if (this.A0S.A04.A01(this.A0F.getPosition()) != 0.0f) {
            return false;
        }
        return true;
    }

    public final boolean A0J() {
        UserSession userSession = this.A0P;
        if (AbstractC54782fb.A00(userSession).booleanValue() && !C18U.A06(C06090Tz.A05, userSession, 2342158546839735666L) && !Ce6()) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC53892dT
    public final C54132eL Aq9() {
        return this.A0S.A04;
    }

    @Override // X.C2fe
    public final double BbC() {
        return C18U.A00(C06090Tz.A06, this.A0P, 37161942540943567L);
    }

    @Override // X.C2fe
    public final boolean BvL() {
        return C18U.A06(C06090Tz.A05, this.A0P, 36317517612062028L);
    }

    @Override // X.InterfaceC53892dT
    public final C54822fg C4b() {
        return this.A0S;
    }

    @Override // X.C2fe
    public final void CKS(MotionEvent motionEvent, Long l, boolean z) {
        UserSession userSession = this.A0P;
        if (C18U.A06(C06090Tz.A05, userSession, 2342160526821627185L) && this.A0C == null) {
            C172077lc A00 = C172077lc.A00(userSession);
            long longValue = l.longValue();
            EnumC129155sc enumC129155sc = EnumC129155sc.TOUCH_MOVED_LEFT;
            GestureDetectorOnGestureListenerC72583Nf gestureDetectorOnGestureListenerC72583Nf = A00.A01;
            if (gestureDetectorOnGestureListenerC72583Nf != null && A00.A00 != null) {
                if (gestureDetectorOnGestureListenerC72583Nf.A08.A00.A05) {
                    gestureDetectorOnGestureListenerC72583Nf.A09.A00();
                }
                gestureDetectorOnGestureListenerC72583Nf.A06.removeCallbacksAndMessages(null);
                gestureDetectorOnGestureListenerC72583Nf.A01(motionEvent, enumC129155sc, longValue, true);
                C129235sl c129235sl = gestureDetectorOnGestureListenerC72583Nf.A01;
                if (z && c129235sl != null) {
                    c129235sl.A02(new C129265so("", "ExternalNavigationModule", null, null));
                }
            }
            this.A05 = longValue;
            this.A07 = motionEvent;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0015, code lost:
    
        if (r4 == false) goto L10;
     */
    @Override // X.C2fe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean Ce8(android.view.MotionEvent r6) {
        /*
            r5 = this;
            X.5dq r0 = r5.A0D
            if (r0 == 0) goto L2f
            X.2od r2 = A02(r5)
            if (r2 == 0) goto L2f
            X.GhJ r0 = r2.A0O()
            X.5dq r1 = r0.A02()
            if (r1 != 0) goto L18
            r4 = 0
        L15:
            if (r4 != 0) goto L2f
        L17:
            return r4
        L18:
            X.GgJ r0 = r2.A08
            if (r0 != 0) goto L26
            java.lang.String r0 = "videoControllerDelegate"
            X.C14360o3.A0F(r0)
            X.00O r0 = X.C00O.createAndThrow()
            throw r0
        L26:
            X.Ghd r0 = r0.A01(r1)
            boolean r0 = r0.A0Q
            r4 = r0 ^ 1
            goto L15
        L2f:
            X.2fg r0 = r5.A0S
            float r2 = r0.A01
            r0 = 0
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L72
            X.2fZ r3 = r5.A0Q
            X.2fd r0 = r3.A02
            boolean r2 = r0.Ce6()
            X.1QO r0 = X.C1QO.A0C
            boolean r0 = r3.A0B(r0)
            r4 = 0
            if (r0 != 0) goto L4c
            if (r2 != 0) goto L4c
            return r4
        L4c:
            androidx.fragment.app.FragmentActivity r0 = r3.A08
            X.0h2 r1 = r0.getSupportFragmentManager()
            r0 = 2131435251(0x7f0b1ef3, float:1.8492339E38)
            androidx.fragment.app.Fragment r0 = r1.A0O(r0)
            if (r0 == 0) goto L17
            X.0h2 r0 = r0.getChildFragmentManager()
            int r0 = r0.A0L()
            if (r0 == 0) goto L67
            if (r2 == 0) goto L17
        L67:
            com.instagram.common.session.UserSession r0 = r3.A09
            X.33K r0 = X.C33J.A00(r0)
            boolean r4 = r0.A00(r6)
            return r4
        L72:
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L87
            X.9Gh r0 = r5.A0A()
            if (r0 == 0) goto L87
            X.9Gh r0 = r5.A0A()
            boolean r4 = r0.Ce8(r6)
            return r4
        L87:
            X.2oe r1 = r5.A0C
            if (r1 == 0) goto L98
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 != 0) goto L98
            X.2fe r1 = (X.C2fe) r1
            boolean r4 = r1.Ce8(r6)
            return r4
        L98:
            androidx.fragment.app.Fragment r0 = A00(r5)
            boolean r0 = r0 instanceof X.C172707mf
            if (r0 == 0) goto La7
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            r4 = 0
            if (r0 == 0) goto L17
        La7:
            r4 = 1
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C54802fd.Ce8(android.view.MotionEvent):boolean");
    }

    @Override // X.C2fe
    public final void DVb() {
        C13080lu A00 = AbstractC13090lv.A00("SwipeNavigationController.onNewPositionEnd");
        try {
            float f = this.A02;
            C54822fg c54822fg = this.A0S;
            if (f == 0.0f && c54822fg.A01 == f && c54822fg.A02 == "swipe" && (A00(this) instanceof C172707mf) && A00(this) == this.A0O.getSupportFragmentManager().A0O(R.id.layout_container_right)) {
                ((C172707mf) A00(this)).AIE(9, null);
                A07(EnumC54812ff.A06);
            }
            C59952od A02 = A02(this);
            if (A02 != null) {
                C14360o3.A0B(c54822fg, 0);
                C120985dq A022 = A02.A0O().A02();
                if (A022 != null) {
                    boolean z = false;
                    if (c54822fg.A01 == 0.0f) {
                        z = true;
                    }
                    String str = "viewerAdapter";
                    C37546Gg2 c37546Gg2 = A02.A0C;
                    if (z) {
                        if (c37546Gg2 != null) {
                            C75113Zb c75113Zb = c37546Gg2.A0A.C09(A022).A0E;
                            if (c75113Zb != null && !c75113Zb.A1v) {
                                c75113Zb.A1v = true;
                                C75113Zb.A00(c75113Zb, 18);
                            }
                            C37540Gfw c37540Gfw = A02.A09;
                            if (c37540Gfw == null) {
                                str = "clipsViewerFragmentViewModel";
                            } else {
                                C37675GiC c37675GiC = c37540Gfw.A06;
                                if (c37675GiC != null) {
                                    if (c37675GiC.A04) {
                                        c37675GiC.A0d.A0W("resume", false);
                                        c37675GiC.A04 = false;
                                    }
                                    if (C1C0.A00(C59952od.A01(A02))) {
                                        C17280tP A002 = C17280tP.A4E.A00();
                                        if (((Boolean) A002.A0M.CES(A002, C17280tP.A4G[173])).booleanValue()) {
                                            AbstractC58577Pxv.A03(A02.requireContext(), A022, C59952od.A01(A02));
                                        }
                                    }
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        }
                        C14360o3.A0F(str);
                        throw C00O.createAndThrow();
                    }
                    if (c37546Gg2 != null) {
                        C75113Zb c75113Zb2 = c37546Gg2.A0A.C09(A022).A0E;
                        if (c75113Zb2 != null && c75113Zb2.A1v) {
                            c75113Zb2.A1v = false;
                            C75113Zb.A00(c75113Zb2, 18);
                        }
                    }
                    C14360o3.A0F(str);
                    throw C00O.createAndThrow();
                }
            }
            if (this.A0M && this.A02 == -1.0f && this.A00 != -1.0f) {
                if (C18U.A06(C06090Tz.A05, this.A0P, 36330024550285955L)) {
                    this.A0M = false;
                }
            }
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    @Override // X.C2fe
    public final boolean Ei8() {
        return C18U.A06(C06090Tz.A05, this.A0P, 36317517610751298L);
    }

    @Override // X.C2fe
    public final void F84(MotionEvent motionEvent) {
        SwipeNavigationContainer swipeNavigationContainer;
        float f;
        boolean z;
        C59862oT c59862oT;
        this.A02 = this.A00;
        C54762fZ c54762fZ = this.A0Q;
        if (c54762fZ.A0B(C1QO.A09)) {
            c54762fZ.A02.Ce6();
        }
        C54802fd c54802fd = c54762fZ.A02;
        if (c54802fd.A0I()) {
            if (A02(c54802fd) != null && c54802fd.Ce6() && (c59862oT = (swipeNavigationContainer = c54802fd.A0F).A0G) != null && c59862oT.A00) {
                f = -1.0f;
                z = false;
            } else {
                C59862oT c59862oT2 = c54802fd.A0F.A0G;
                if ((c59862oT2 != null && c59862oT2.A00) || !c54802fd.A0Q.A0B(C1QO.A0C) || A02(c54802fd) != null) {
                    return;
                }
                swipeNavigationContainer = c54802fd.A0F;
                f = -1.0f;
                z = true;
            }
            swipeNavigationContainer.A03(z, f);
        }
    }

    @Override // X.InterfaceC53892dT
    public final void FBp(PositionConfig positionConfig) {
        C13080lu A00 = AbstractC13090lv.A00("SwipeNavigationController.updatePosition");
        try {
            float f = positionConfig.A00;
            UserSession userSession = this.A0P;
            if (AbstractC54792fc.A07(userSession) && this.A0Q.A0B(C1QO.A0E) && f == 1.0f) {
                this.A0F.A03(true, f);
            }
            C06090Tz c06090Tz = C06090Tz.A05;
            if ((C18U.A06(c06090Tz, userSession, 2342160526819267880L) || C18U.A06(c06090Tz, userSession, 2342160526819202343L)) && positionConfig.A0D.equals("camera_tab_bar")) {
                this.A0F.A03(true, -1.0f);
            }
            this.A0F.setPosition(positionConfig);
            A00.close();
        } catch (Throwable th) {
            try {
                A00.close();
                throw th;
            } catch (Throwable th2) {
                Throwable.class.getDeclaredMethod("addSuppressed", Throwable.class).invoke(th, th2);
                throw th;
            }
        }
    }

    public C54802fd(FragmentActivity fragmentActivity, UserSession userSession, C54132eL c54132eL, C54762fZ c54762fZ) {
        this.A0O = fragmentActivity;
        this.A0P = userSession;
        this.A0S = new C54822fg(c54132eL);
        this.A0R = new C54832fh(fragmentActivity, userSession);
        this.A0Q = c54762fZ;
    }

    private void A03() {
        C120985dq A09 = A09();
        if (A09 == null) {
            A09 = this.A0D;
        }
        this.A0D = A09;
    }

    public final C120985dq A09() {
        C59952od A02 = A02(this);
        if (A02 != null) {
            return A02.A0O().A02();
        }
        return null;
    }

    public final boolean A0K() {
        C120985dq A09 = A09();
        if (A09 != null) {
            if (AbstractC37852Gl6.A01(this.A0O, A09, this.A0P)) {
                return true;
            }
        }
        return false;
    }

    @Override // X.C2fe
    public final C25548BRk AvQ() {
        if (Ce6() && !A0H()) {
            C120985dq A09 = A09();
            UserSession userSession = this.A0P;
            boolean A06 = C18U.A06(C06090Tz.A06, userSession, 2342160526821430575L);
            long A00 = ((C37727Gj2) C37727Gj2.A02.getValue()).A00();
            this.A04 = A00;
            if (C59942oc.A08(A09, userSession)) {
                return AbstractC58577Pxv.A01(userSession, A00);
            }
            return AbstractC58577Pxv.A00(A09, userSession, A00, A06, AbstractC58577Pxv.A03(this.A0F.getContext().getApplicationContext(), A09, userSession));
        }
        return null;
    }

    @Override // X.C2fe
    public final boolean Ce6() {
        C120985dq A02;
        boolean A06;
        ClipsWatchAndBrowseData clipsWatchAndBrowseData;
        String str;
        C59952od A022 = A02(this);
        if (A022 == null || (A02 = A022.A0O().A02()) == null) {
            return false;
        }
        if (A02.A0b) {
            if (C18U.A06(C06090Tz.A05, C59952od.A01(A022), 36326910699190464L)) {
                return false;
            }
        }
        if (A02.A0F() || A02.A0G() || C76253bV.A00(A02, C59952od.A01(A022))) {
            return false;
        }
        if (A02.A0H()) {
            C38661Gz2 A023 = A02.A02();
            if (A023 != null) {
                str = A023.A0B;
            } else {
                str = null;
            }
            if (C14360o3.A0K(str, "reels_megaphone")) {
                return false;
            }
        }
        if (A02.A0K == null) {
            return false;
        }
        ClipsViewerConfig A00 = C59952od.A00(A022);
        if (A00 != null && (clipsWatchAndBrowseData = A00.A0K) != null && !clipsWatchAndBrowseData.A0D) {
            return false;
        }
        A022.A0M();
        C75113Zb c75113Zb = A022.A0M().A01(A02).A0E;
        if (c75113Zb == null) {
            return false;
        }
        EnumC37732Gj7 enumC37732Gj7 = c75113Zb.A0n;
        if (enumC37732Gj7 != null && enumC37732Gj7 != EnumC37732Gj7.A03) {
            return false;
        }
        if (!AbstractC37852Gl6.A01(A022.requireActivity(), A02, C59952od.A01(A022))) {
            if (A02.CdW()) {
                UserSession A01 = C59952od.A01(A022);
                C14360o3.A0B(A01, 0);
                if (!C18U.A06(C06090Tz.A06, A01, 36317517608457527L)) {
                    if (AbstractC37852Gl6.A00(A022.requireActivity(), A02, C59952od.A01(A022))) {
                        return false;
                    }
                }
                UserSession A012 = C59952od.A01(A022);
                C14360o3.A0B(A012, 0);
                C06090Tz c06090Tz = C06090Tz.A05;
                if (C18U.A06(c06090Tz, A012, 36317517608457527L)) {
                    if (AbstractC37852Gl6.A02(A022.requireActivity(), A02, C59952od.A01(A022))) {
                        return false;
                    }
                }
                UserSession A013 = C59952od.A01(A022);
                C14360o3.A0B(A013, 0);
                if (!C18U.A06(c06090Tz, A013, 2342160526819202343L)) {
                    A06 = C59942oc.A07(A02, C59952od.A01(A022));
                } else {
                    return true;
                }
            } else {
                C75113Zb c75113Zb2 = A022.A0M().A01(A02).A0E;
                if (c75113Zb2 != null && c75113Zb2.A23) {
                    return false;
                }
                if (!C59942oc.A0C(C59952od.A01(A022))) {
                    UserSession A014 = C59952od.A01(A022);
                    C14360o3.A0B(A014, 0);
                    A06 = C18U.A06(C06090Tz.A05, A014, 2342160526819267880L);
                } else {
                    return true;
                }
            }
            if (!A06) {
                return false;
            }
            return true;
        }
        return true;
    }
}
