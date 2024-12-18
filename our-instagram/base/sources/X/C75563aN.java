package X;

import android.content.Context;
import com.instagram.api.schemas.ClipsMashupType;
import com.instagram.api.schemas.CollabFollowButtonInfo;
import com.instagram.api.schemas.OpenCarouselSubmissionState;
import com.instagram.api.schemas.OriginalSoundDataIntf;
import com.instagram.common.session.UserSession;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.3aN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C75563aN {
    public static final AtomicBoolean A0E = new AtomicBoolean(false);
    public final UserSession A00;
    public final InterfaceC75453aC A01;
    public final C57332k8 A02;
    public final InterfaceC09390do A03;
    public final InterfaceC09390do A04;
    public final InterfaceC09390do A05;
    public final InterfaceC09390do A06;
    public final InterfaceC09390do A07;
    public final InterfaceC09390do A08;
    public final InterfaceC09390do A09;
    public final InterfaceC09390do A0A;
    public final InterfaceC09390do A0B;
    public final InterfaceC09390do A0C;
    public final boolean A0D;

    public C75563aN(UserSession userSession, InterfaceC75453aC interfaceC75453aC, C57332k8 c57332k8, boolean z) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(interfaceC75453aC, 3);
        this.A00 = userSession;
        this.A0D = z;
        this.A01 = interfaceC75453aC;
        this.A02 = c57332k8;
        this.A06 = AbstractC09440dt.A01(new C9EE(this, 25));
        this.A0C = AbstractC09440dt.A01(new C9EE(this, 31));
        this.A05 = AbstractC09440dt.A01(new C9EE(this, 24));
        this.A0B = AbstractC09440dt.A01(new C9EE(this, 30));
        this.A03 = AbstractC09440dt.A01(new C9EE(this, 22));
        this.A07 = AbstractC09440dt.A01(new C9EE(this, 26));
        this.A08 = AbstractC09440dt.A01(new C9EE(this, 27));
        this.A04 = AbstractC09440dt.A01(new C9EE(this, 23));
        this.A09 = AbstractC09440dt.A01(new C9EE(this, 28));
        this.A0A = AbstractC09440dt.A01(new C9EE(this, 29));
    }

    public static final String A00(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        String id = c38321qM.getId();
        if (id != null) {
            return id;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final int A02(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(userSession, 2);
        return A03(userSession, c38321qM, c75113Zb, c38321qM.A6H());
    }

    public final int A03(UserSession userSession, C38321qM c38321qM, C75113Zb c75113Zb, boolean z) {
        Integer valueOf;
        String str;
        Object[] objArr;
        int i;
        OriginalSoundDataIntf BZw;
        C14360o3.A0B(c38321qM, 1);
        C14360o3.A0B(c75113Zb, 2);
        C14360o3.A0B(userSession, 3);
        User A2E = c38321qM.A2E(userSession);
        int i2 = 0;
        if (A2E == null) {
            C0f5 AEp = C18950wb.A01.AEp("MediaHeaderInvalidHashCalculation", 817899586);
            AEp.ABW("media_id", c38321qM.getId());
            AEp.report();
            objArr = new Object[]{c38321qM.getId()};
        } else {
            Integer num = null;
            if (!z && !c75113Zb.A2a) {
                valueOf = null;
            } else {
                valueOf = Integer.valueOf(A2E.B7L().ordinal());
            }
            Boolean valueOf2 = Boolean.valueOf(A2E.A23());
            C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
            if (clipsMetadata != null && (BZw = clipsMetadata.BZw()) != null) {
                str = BZw.getOriginalAudioTitle();
            } else {
                str = null;
            }
            if (!this.A0D) {
                if (A2E.A03.BNu() != null) {
                    i = 2;
                } else {
                    i = 0;
                    if (C75643aV.A00.A00(this.A00, c38321qM, c75113Zb) != null) {
                        i = 1;
                    }
                }
                num = Integer.valueOf(i);
            }
            boolean z2 = false;
            if (c38321qM.A0C.Bns() != null) {
                z2 = true;
            }
            Boolean valueOf3 = Boolean.valueOf(z2);
            EnumC75663aX A20 = c38321qM.A20();
            List coauthorProducers = c38321qM.A0C.getCoauthorProducers();
            Venue A27 = c38321qM.A27();
            C88543xC A1Q = c38321qM.A1Q();
            OriginalSoundDataIntf A1K = c38321qM.A1K();
            OpenCarouselSubmissionState BZ5 = c38321qM.A0C.BZ5();
            Integer Aob = c38321qM.A0C.Aob();
            if (Aob != null) {
                i2 = Aob.intValue();
            }
            objArr = new Object[]{valueOf, valueOf2, str, num, valueOf3, A20, coauthorProducers, A27, A1Q, A1K, BZ5, Integer.valueOf(i2)};
        }
        return Arrays.hashCode(objArr);
    }

    public final InterfaceC76863cY A04(Context context, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, C76293bZ c76293bZ, C75113Zb c75113Zb, String str) {
        C14360o3.A0B(c38321qM, 0);
        C14360o3.A0B(c75113Zb, 1);
        C14360o3.A0B(c76293bZ, 2);
        C14360o3.A0B(context, 3);
        C14360o3.A0B(interfaceC60442pS, 4);
        return A05(context, c38321qM, interfaceC60442pS, c76293bZ, c75113Zb, str, false);
    }

    public static final boolean A01(C38321qM c38321qM, C75563aN c75563aN, C76293bZ c76293bZ, C76853cX c76853cX) {
        ClipsMashupType clipsMashupType;
        Boolean bool;
        boolean z;
        boolean z2;
        InterfaceC84163p3 BPh;
        UserSession userSession = c75563aN.A00;
        User A2E = c38321qM.A2E(userSession);
        C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
        Boolean bool2 = null;
        if (clipsMetadata != null && (BPh = clipsMetadata.BPh()) != null) {
            clipsMashupType = BPh.BPi();
        } else {
            clipsMashupType = null;
        }
        boolean z3 = false;
        if (clipsMashupType != null) {
            z3 = true;
        }
        if (A2E != null) {
            if (A2E.B7L() == FollowStatus.A08 || !c76293bZ.A09 || c76853cX.A07.A00 || c76853cX.A0P || c38321qM.A5u() || c38321qM.A1x() == EnumC76383bi.A04 || ((!c38321qM.CdW() && c38321qM.A5t()) || c38321qM.A0C.AaN() != null)) {
                return false;
            }
            if (c38321qM.A4j()) {
                if (!c38321qM.A4j()) {
                    return false;
                }
                CollabFollowButtonInfo Aos = c38321qM.A0C.Aos();
                if (Aos != null && C14360o3.A0K(Aos.CZy(), true)) {
                    CollabFollowButtonInfo Aos2 = c38321qM.A0C.Aos();
                    if (Aos2 == null) {
                        return false;
                    }
                    return C14360o3.A0K(Aos2.BwM(), true);
                }
                List<User> coauthorProducers = c38321qM.A0C.getCoauthorProducers();
                Boolean bool3 = null;
                if (coauthorProducers != null) {
                    if (!(coauthorProducers instanceof Collection) || !coauthorProducers.isEmpty()) {
                        for (User user : coauthorProducers) {
                            if (!C14360o3.A0K(C17060sy.A01.A01(userSession), user) && C57582kX.A00(userSession).A0N(user) == FollowStatus.A06) {
                                z2 = true;
                                break;
                            }
                        }
                    }
                    z2 = false;
                    bool = Boolean.valueOf(z2);
                } else {
                    bool = null;
                }
                List coauthorProducers2 = c38321qM.A0C.getCoauthorProducers();
                if (coauthorProducers2 != null) {
                    if (!(coauthorProducers2 instanceof Collection) || !coauthorProducers2.isEmpty()) {
                        Iterator it = coauthorProducers2.iterator();
                        while (it.hasNext()) {
                            if (!(!C14360o3.A0K(C17060sy.A01.A01(userSession), it.next()))) {
                                z = false;
                                break;
                            }
                        }
                    }
                    z = true;
                    bool2 = Boolean.valueOf(z);
                }
                boolean z4 = !C14360o3.A0K(c38321qM.A2E(userSession), C17060sy.A01.A01(userSession));
                User CDj = c38321qM.A0C.CDj();
                if (CDj != null) {
                    boolean z5 = false;
                    if (C57582kX.A00(userSession).A0N(CDj) == FollowStatus.A06) {
                        z5 = true;
                    }
                    bool3 = Boolean.valueOf(z5);
                }
                if ((!C14360o3.A0K(bool, true) && !C14360o3.A0K(bool3, true)) || !C14360o3.A0K(bool2, true) || !z4 || !C18U.A06(C06090Tz.A05, userSession, 36325914266646021L)) {
                    return false;
                }
                return true;
            }
            if (c38321qM.A6Y(userSession)) {
                return AbstractC76243bU.A04(userSession, c38321qM, null);
            }
            if (z3 && C76263bW.A02(userSession, c38321qM)) {
                return AbstractC76243bU.A02(userSession, c38321qM, null);
            }
            if (!c38321qM.A6P()) {
                return true;
            }
            return AbstractC76243bU.A03(userSession, c38321qM, null);
        }
        throw new IllegalStateException("Required value was null.");
    }

    /* JADX WARN: Code restructure failed: missing block: B:107:0x0242, code lost:
    
        if (X.AbstractC76643c9.A0I(r3, r91) == false) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0272, code lost:
    
        if (r2 != com.instagram.api.schemas.AdsAPIInstagramPosition.A0A) goto L107;
     */
    /* JADX WARN: Code restructure failed: missing block: B:191:0x087e, code lost:
    
        if (X.AbstractC41071vF.A0Q(r3, r91) != false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x094d, code lost:
    
        if (X.C18U.A06(r26, r3, 36317762418644528L) == false) goto L440;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0197, code lost:
    
        if (r11 == null) goto L71;
     */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028a  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02a6  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x02dd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x07f4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x09fd  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:437:0x0638  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x0640  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0a19  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0770  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01f3  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.InterfaceC76863cY A05(android.content.Context r90, X.C38321qM r91, X.InterfaceC60442pS r92, X.C76293bZ r93, X.C75113Zb r94, java.lang.String r95, boolean r96) {
        /*
            Method dump skipped, instructions count: 2605
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C75563aN.A05(android.content.Context, X.1qM, X.2pS, X.3bZ, X.3Zb, java.lang.String, boolean):X.3cY");
    }
}
