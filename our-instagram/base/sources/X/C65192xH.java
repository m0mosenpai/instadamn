package X;

import android.content.Context;
import android.util.Pair;
import android.view.View;
import android.widget.ListAdapter;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: X.2xH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65192xH extends AbstractC65202xI implements InterfaceC65222xK, InterfaceC65242xM, InterfaceC65252xN, ListAdapter, InterfaceC65262xO, InterfaceC65272xP, InterfaceC65292xR, InterfaceC65302xS {
    public int A00;
    public View A01;
    public View A02;
    public AnonymousClass307 A03;
    public C110424yE A04;
    public C47K A05;
    public C671331e A06;
    public C81063jb A07;
    public C5GM A08;
    public C4NL A09;
    public final C65662y2 A0A;
    public final C65662y2 A0B;
    public final UserSession A0C;
    public final C65882yQ A0D;
    public final C65832yL A0E;
    public final C65672y3 A0F;
    public final C65622xy A0G;
    public final C65762yE A0H;
    public final C65862yO A0I;
    public final C65602xw A0J;
    public final C65812yJ A0K;
    public final InterfaceC60442pS A0L;
    public final C65732yB A0M;
    public final C65822yK A0N;
    public final C65872yP A0O;
    public final C65502xm A0P;
    public final C65792yH A0Q;
    public final C65992yb A0R;
    public final C65122xA A0S;
    public final C61762rd A0T;
    public final C65852yN A0U;
    public final C2y9 A0V;
    public final C65712y8 A0W;
    public final InterfaceC63342uH A0X;
    public final C1I2 A0Y;
    public final InterfaceC60682pr A0Z;
    public final C65772yF A0a;
    public final InterfaceC62602sz A0b;
    public final C65842yM A0c;
    public final C63232u0 A0d;
    public final List A0e;
    public final List A0f;
    public final Map A0g;
    public final java.util.Set A0h;
    public final java.util.Set A0i;
    public final java.util.Set A0j;
    public final java.util.Set A0k;
    public final InterfaceC09390do A0l;
    public final InterfaceC09390do A0m;
    public final boolean A0n;
    public final Context A0o;
    public final C65662y2 A0p;
    public final InterfaceC65942yW A0q;
    public final InterfaceC61352qx A0r;
    public final C61512rE A0s;
    public final C63242u1 A0t;
    public final boolean A0u;

    public final int A02(int i) {
        int AnZ;
        int count;
        boolean z;
        int i2 = -1;
        try {
            C3FQ scrollingViewProxy = this.A0Z.getScrollingViewProxy();
            ArrayList arrayList = new ArrayList();
            Iterator it = A07().iterator();
            while (it.hasNext()) {
                InterfaceC38381qS interfaceC38381qS = ((C3XG) it.next()).A05;
                InterfaceC38381qS A02 = C3XH.A02(interfaceC38381qS);
                if (A02 == null) {
                    A02 = interfaceC38381qS;
                }
                arrayList.add(A02);
            }
            int B6q = scrollingViewProxy.B6q();
            int BM3 = scrollingViewProxy.BM3();
            if (B6q >= 0 && BM3 >= 0) {
                int i3 = B6q;
                int i4 = 0;
                int i5 = -1;
                while (i3 <= BM3) {
                    try {
                        try {
                            Object item = getItem(i3);
                            if (item != null) {
                                if (item instanceof InterfaceC38371qR) {
                                    View AnW = scrollingViewProxy.AnW(i3);
                                    if (AnW == null) {
                                        AnZ = scrollingViewProxy.AnZ();
                                        count = scrollingViewProxy.getCount();
                                        z = true;
                                    } else {
                                        int max = Math.max(AnW.getTop(), 0);
                                        while (i3 <= BM3 && getItem(i3) == item) {
                                            i3++;
                                        }
                                        View AnW2 = scrollingViewProxy.AnW(i3 - 1);
                                        if (AnW2 == null) {
                                            AnZ = scrollingViewProxy.AnZ();
                                            count = scrollingViewProxy.getCount();
                                            z = false;
                                        } else {
                                            int min = Math.min(AnW2.getBottom(), scrollingViewProxy.CFj().getBottom()) - max;
                                            if (min > i4) {
                                                i5 = arrayList.indexOf(item);
                                                i4 = min;
                                            }
                                        }
                                    }
                                    VVL.A00("Null view in getMostVisibleMediaIndex.", B6q, BM3, i3, AnZ, count, z);
                                    break;
                                }
                                i3++;
                            }
                        } catch (IllegalStateException unused) {
                            i2 = i5;
                            C0w9.A03("MainFeedAdapter", "getMostVisibleMediaIndex called after fragment is destroyed");
                            return i2;
                        }
                    } catch (IndexOutOfBoundsException unused2) {
                        VVL.A00("IndexOutOfBounds in getMostVisibleMediaIndex.", B6q, BM3, i3, scrollingViewProxy.AnZ(), scrollingViewProxy.getCount(), true);
                        return -1;
                    }
                }
                if (i <= 0 || i4 >= i * 0.7f) {
                    return i5;
                }
                return -1;
            }
            return -1;
        } catch (IllegalStateException unused3) {
        }
    }

    public final void A0B(C3XG c3xg, int i, boolean z) {
        C81063jb c81063jb;
        List list;
        List list2;
        C14360o3.A0B(c3xg, 0);
        boolean z2 = false;
        if (C3ZD.A00 != null) {
            z2 = true;
        }
        if (!z2) {
            AbstractC65332xV.A01((AbstractC65332xV) ((AbstractC65202xI) this).A00, c3xg, i, z);
            if (z) {
                A0A(-1);
            }
        }
        InterfaceC38381qS interfaceC38381qS = c3xg.A05;
        C38321qM A02 = C3XH.A02(interfaceC38381qS);
        boolean z3 = true;
        if (A02 != null && (c81063jb = this.A07) != null && c81063jb.A08(A02, false)) {
            C61762rd c61762rd = this.A0T;
            if (!c61762rd.BRZ(A02).A2b) {
                if (C3ZD.A00 == null) {
                    z3 = false;
                }
                AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
                ImmutableList copyOf = ImmutableList.copyOf((Collection) abstractC65332xV.A02);
                C14360o3.A07(copyOf);
                if (z3) {
                    int size = i - copyOf.size();
                    MUW muw = C3ZD.A00;
                    if (muw != null && (list2 = (List) muw.A00) != null && size <= list2.size()) {
                        list2.add(i - copyOf.size(), c3xg);
                    }
                } else {
                    C3ZD.A00 = new MUW(new ArrayList(), AbstractC001800i.A0U(copyOf.subList(i + 1, copyOf.size())), (String) null, (String) null, 14);
                }
                C38321qM A022 = C3XH.A02(interfaceC38381qS);
                if (A022 != null) {
                    C75113Zb BRZ = c61762rd.BRZ(A022);
                    BRZ.A3A = true;
                    C81063jb c81063jb2 = this.A07;
                    if (c81063jb2 != null && c81063jb2.A0K.A00()) {
                        BRZ.A38 = true;
                    }
                }
                this.A0A.A03 = this.A00;
                MUW muw2 = C3ZD.A00;
                if (muw2 != null && (list = (List) muw2.A00) != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        abstractC65332xV.A0D(it.next());
                    }
                    A0A(-1);
                }
            }
        }
    }

    public final void A0C(C47K c47k, String str, String str2, List list, boolean z) {
        C81063jb c81063jb;
        C3ZD c3zd = C3ZD.A01;
        if (C3ZD.A00 != null) {
            c3zd.A00(str, str2, list);
            return;
        }
        Iterator it = list.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C38321qM A02 = C3XH.A02(((C3XG) it.next()).A05);
            if (A02 != null && (c81063jb = this.A07) != null && c81063jb.A08(A02, false)) {
                C61762rd c61762rd = this.A0T;
                if (!c61762rd.BRZ(A02).A2b) {
                    if (i != -1) {
                        int i2 = i + 1;
                        ((C65312xT) ((AbstractC65202xI) this).A00).A0G(c61762rd, str, list.subList(0, i2), z);
                        this.A0A.A03 = this.A00;
                        c3zd.A00(str, str2, list.subList(i2, list.size()));
                        C38321qM A022 = C3XH.A02(((C3XG) list.get(i)).A05);
                        if (A022 != null) {
                            C75113Zb BRZ = c61762rd.BRZ(A022);
                            BRZ.A3A = true;
                            C81063jb c81063jb2 = this.A07;
                            if (c81063jb2 != null && c81063jb2.A0K.A00()) {
                                BRZ.A38 = true;
                            }
                        }
                    }
                }
            }
            i++;
        }
        ((C65312xT) ((AbstractC65202xI) this).A00).A0G(this.A0T, str, list, z);
        this.A05 = c47k;
        if (!z) {
            return;
        }
        A0A(-1);
    }

    public final void A0E(User user) {
        String str;
        User A2E;
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = abstractC65332xV.A02.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C3XG c3xg = (C3XG) next;
            C14360o3.A0B(c3xg, 0);
            if (c3xg.A06 == C1XV.A0Y) {
                C38321qM A02 = C3XH.A02(c3xg.A05);
                if (A02 != null && (A2E = A02.A2E(this.A0C)) != null) {
                    str = A2E.getId();
                } else {
                    str = null;
                }
                if (C14360o3.A0K(str, user.getId())) {
                    arrayList.add(next);
                }
            }
            arrayList2.add(next);
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            abstractC65332xV.A0D(it2.next());
        }
        abstractC65332xV.A01 = Collections.unmodifiableList(arrayList2);
        AbstractC65332xV.A00(abstractC65332xV);
        A0A(-1);
    }

    @Override // X.InterfaceC65282xQ
    public final void A8q(Object obj, int i) {
        C14360o3.A0B(obj, 0);
        if (obj instanceof C3XG) {
            A0B((C3XG) obj, i, true);
        }
    }

    @Override // X.InterfaceC65282xQ
    public final void AVK() {
        A0A(-1);
    }

    @Override // X.InterfaceC65282xQ
    public final int BK6(String str) {
        C14360o3.A0B(str, 0);
        Number number = (Number) ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A03.get(str);
        if (number != null) {
            return number.intValue();
        }
        return -1;
    }

    @Override // X.InterfaceC61772re, X.InterfaceC61782rf
    public final C75113Zb BRZ(C38321qM c38321qM) {
        C14360o3.A0B(c38321qM, 0);
        return this.A0T.BRZ(c38321qM);
    }

    @Override // X.InterfaceC65292xR
    public final C114385Ef C3v(C47K c47k) {
        C14360o3.A0B(c47k, 0);
        return this.A0T.A00(c47k);
    }

    @Override // X.InterfaceC65282xQ
    public final boolean CSO() {
        return false;
    }

    @Override // X.InterfaceC65282xQ
    public final void Ct5() {
    }

    @Override // X.InterfaceC65232xL
    public final void CtR(C38321qM c38321qM) {
        A0A(-1);
    }

    @Override // X.InterfaceC65272xP
    public final void EUR(C33P c33p) {
        C14360o3.A0B(c33p, 0);
        this.A0F.A03 = c33p;
        this.A0a.A00 = c33p;
        C65622xy c65622xy = this.A0G;
        if (c65622xy != null) {
            c65622xy.A01 = c33p;
        }
    }

    @Override // X.C2UU
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A0m.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = recyclerView;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x005a, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A0C, 36314983575063484L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00c2, code lost:
    
        if (X.C18U.A06(X.C06090Tz.A05, r8.A0C, 2342157992788822973L) != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00b2, code lost:
    
        if (r4 != null) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:57:? A[RETURN, SYNTHETIC] */
    @Override // X.C2US
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onBindViewHolder(X.C3OQ r9, int r10) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65192xH.onBindViewHolder(X.3OQ, int):void");
    }

    @Override // X.C2UU
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C14360o3.A0B(recyclerView, 0);
        C66772zu c66772zu = (C66772zu) this.A0m.getValue();
        if (c66772zu != null) {
            c66772zu.A00 = null;
        }
    }

    @Override // X.C2US
    public final void onViewRecycled(C3OQ c3oq) {
        C14360o3.A0B(c3oq, 0);
        super.onViewRecycled(c3oq);
        if (this.A0m.getValue() != null) {
            View view = c3oq.itemView;
            C14360o3.A06(view);
            C66772zu.A00(view);
        }
    }

    public static final void A00(Throwable th) {
        C0f5 AEp = C18950wb.A01.AEp("IGFeedDelayedSkip", 817903741);
        AEp.ABW(DialogModule.KEY_MESSAGE, "getDelayedSkipMediaPositionInfo called after fragment is destroyed");
        AEp.ERI(th);
        AEp.report();
    }

    public final C3XG A03(int i) {
        Object obj = ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01.get(i);
        C14360o3.A07(obj);
        return (C3XG) obj;
    }

    public final C3XG A04(int i) {
        if (i >= 0 && i < ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01.size()) {
            return A03(i);
        }
        return null;
    }

    public final C110464yI A05(C3CL c3cl) {
        C61762rd c61762rd = this.A0T;
        Map map = c61762rd.A06;
        String str = c3cl.A04.A0B;
        C110464yI c110464yI = (C110464yI) map.get(str);
        if (c110464yI == null) {
            c110464yI = new C110464yI(c61762rd.A01, c61762rd.A00);
            if (str == null) {
                str = "";
            }
            map.put(str, c110464yI);
        }
        return c110464yI;
    }

    public final ArrayList A06() {
        List list = ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01;
        C14360o3.A07(list);
        ArrayList arrayList = new ArrayList(list.size());
        for (Object obj : list) {
            C14360o3.A07(obj);
            String str = ((C3XG) obj).A09;
            if (str == null) {
                str = "";
            }
            arrayList.add(str);
        }
        return arrayList;
    }

    public final List A07() {
        List unmodifiableList = Collections.unmodifiableList(((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final List A08() {
        ImmutableList copyOf = ImmutableList.copyOf((Collection) ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A02);
        C14360o3.A07(copyOf);
        List unmodifiableList = Collections.unmodifiableList(copyOf);
        C14360o3.A07(unmodifiableList);
        return unmodifiableList;
    }

    public final void A09() {
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        Iterator it = abstractC65332xV.A02.iterator();
        C14360o3.A07(it);
        while (it.hasNext()) {
            Object next = it.next();
            C3XG c3xg = (C3XG) next;
            C14360o3.A0B(c3xg, 0);
            if (c3xg.A06 != C1XV.A06) {
                arrayList2.add(next);
            } else {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            abstractC65332xV.A0D(it2.next());
        }
        abstractC65332xV.A01 = Collections.unmodifiableList(arrayList2);
        AbstractC65332xV.A00(abstractC65332xV);
        A0A(-1);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x00f0, code lost:
    
        if (r0 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x0221, code lost:
    
        if (r0.booleanValue() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x023d, code lost:
    
        if (r1.contains("ig_select_free_data_banner") != false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x025f, code lost:
    
        if (r1.contains("ig_select_free_data_banner") != false) goto L134;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008c, code lost:
    
        if (r18 != false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:324:0x0672, code lost:
    
        if (X.C14360o3.A0K(r1, "SIMPLE_CTA_CLOSE_FRIENDS_FACEPILE") != false) goto L308;
     */
    /* JADX WARN: Code restructure failed: missing block: B:485:0x0a8e, code lost:
    
        if (r1 != X.C1XV.A0g) goto L416;
     */
    /* JADX WARN: Code restructure failed: missing block: B:597:0x0ef9, code lost:
    
        if (r9.CdW() != false) goto L560;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00db, code lost:
    
        if (r2.A0D(r3, X.C05F.A0N, r1) == false) goto L46;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:194:0x03ad. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:197:0x03b6 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0d99 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0107 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:561:0x0def  */
    /* JADX WARN: Removed duplicated region for block: B:564:0x0df7 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:586:0x0ec5 A[Catch: all -> 0x0f67, TRY_LEAVE, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:591:0x0ede A[Catch: all -> 0x0f56, TryCatch #1 {all -> 0x0f56, blocks: (B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:587:0x0ecd, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:614:0x0f28  */
    /* JADX WARN: Removed duplicated region for block: B:629:0x0f44 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:632:0x0f4f  */
    /* JADX WARN: Removed duplicated region for block: B:633:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0169 A[Catch: all -> 0x0f67, TryCatch #2 {all -> 0x0f67, blocks: (B:5:0x0010, B:7:0x001c, B:14:0x002a, B:16:0x0037, B:17:0x004a, B:19:0x0050, B:21:0x005a, B:22:0x006d, B:24:0x0073, B:28:0x008f, B:30:0x0097, B:31:0x009f, B:33:0x00a3, B:35:0x00a7, B:91:0x00b9, B:93:0x00bd, B:95:0x00c7, B:97:0x00d4, B:99:0x00de, B:101:0x00eb, B:104:0x00f5, B:106:0x00fe, B:80:0x0186, B:40:0x0107, B:46:0x015c, B:49:0x0110, B:51:0x011c, B:52:0x011e, B:54:0x0122, B:55:0x0127, B:57:0x0132, B:58:0x0134, B:62:0x013d, B:66:0x0149, B:72:0x0161, B:74:0x0169, B:79:0x017c, B:84:0x0170, B:89:0x0125, B:113:0x018b, B:114:0x018f, B:116:0x0195, B:118:0x019d, B:121:0x01aa, B:122:0x01ad, B:125:0x01f3, B:127:0x01f9, B:132:0x020e, B:134:0x0212, B:135:0x0219, B:137:0x0224, B:139:0x0236, B:141:0x0240, B:143:0x0252, B:145:0x0258, B:147:0x0262, B:149:0x0294, B:151:0x02a0, B:153:0x02a7, B:154:0x02ac, B:156:0x02b4, B:159:0x02d5, B:161:0x02e1, B:163:0x02f9, B:167:0x02fe, B:169:0x030a, B:171:0x0315, B:174:0x0318, B:176:0x031c, B:179:0x0327, B:181:0x032d, B:182:0x033c, B:184:0x0348, B:186:0x0358, B:188:0x035d, B:191:0x0399, B:193:0x03a3, B:194:0x03ad, B:195:0x03b0, B:197:0x03b6, B:199:0x03c8, B:200:0x03ca, B:202:0x03da, B:203:0x03dc, B:206:0x0dab, B:207:0x03e3, B:209:0x03e9, B:210:0x03ec, B:212:0x03f0, B:213:0x0d99, B:215:0x0d9f, B:218:0x03f3, B:226:0x0415, B:228:0x0421, B:229:0x0429, B:231:0x042d, B:233:0x0433, B:235:0x0441, B:237:0x0daf, B:425:0x0f66, B:239:0x0448, B:241:0x0454, B:242:0x0465, B:243:0x0cc6, B:244:0x0469, B:246:0x0471, B:248:0x0479, B:249:0x047f, B:251:0x0485, B:252:0x048e, B:254:0x049d, B:256:0x04ab, B:257:0x04bc, B:259:0x04c2, B:261:0x04ca, B:263:0x04d2, B:264:0x04db, B:266:0x04e3, B:267:0x04f4, B:268:0x04f8, B:270:0x050b, B:274:0x051f, B:276:0x052c, B:277:0x0533, B:279:0x0537, B:281:0x053f, B:282:0x0544, B:286:0x054b, B:287:0x0531, B:289:0x0db6, B:294:0x0dbd, B:296:0x0552, B:299:0x0588, B:310:0x0605, B:315:0x0644, B:316:0x064d, B:318:0x065a, B:320:0x0662, B:322:0x066a, B:323:0x066c, B:326:0x0674, B:328:0x069e, B:330:0x06aa, B:335:0x06b7, B:337:0x06c9, B:338:0x0701, B:340:0x0709, B:342:0x0711, B:344:0x07b3, B:345:0x07d3, B:347:0x07e4, B:349:0x0dd5, B:352:0x0721, B:353:0x076f, B:357:0x0779, B:359:0x0781, B:361:0x078a, B:364:0x078d, B:366:0x079c, B:368:0x0dc4, B:370:0x07e9, B:372:0x07f1, B:374:0x0800, B:377:0x080d, B:378:0x081a, B:380:0x0820, B:383:0x082c, B:388:0x0839, B:390:0x0841, B:391:0x084d, B:393:0x0853, B:396:0x085f, B:401:0x0891, B:402:0x08cd, B:403:0x0867, B:404:0x08cf, B:406:0x08d7, B:407:0x08ec, B:408:0x063a, B:424:0x0f65, B:426:0x0607, B:428:0x0623, B:430:0x062a, B:431:0x062f, B:432:0x08f3, B:433:0x0904, B:435:0x091e, B:436:0x092a, B:437:0x0c15, B:438:0x0931, B:439:0x0946, B:441:0x0955, B:442:0x095d, B:444:0x0972, B:445:0x0984, B:447:0x098a, B:449:0x09aa, B:450:0x09b0, B:452:0x09c1, B:454:0x09c9, B:458:0x09dc, B:460:0x09f8, B:463:0x0a01, B:464:0x0a04, B:465:0x0a13, B:467:0x0a2d, B:470:0x0a3a, B:471:0x0a3d, B:472:0x0a44, B:475:0x0a5c, B:477:0x0a62, B:478:0x0a6a, B:482:0x0a79, B:484:0x0a8c, B:486:0x0a90, B:488:0x0aa4, B:490:0x0abd, B:491:0x0ac9, B:492:0x0adf, B:494:0x0af8, B:495:0x0b00, B:496:0x0b16, B:499:0x0b2c, B:501:0x0b32, B:502:0x0b3a, B:503:0x0b43, B:506:0x0b59, B:508:0x0b5f, B:509:0x0b67, B:510:0x0b70, B:513:0x0b86, B:515:0x0b8c, B:516:0x0b94, B:517:0x0b9c, B:518:0x0bbd, B:520:0x0bd8, B:521:0x0be0, B:522:0x0bea, B:524:0x0c04, B:525:0x0c10, B:526:0x0c1a, B:528:0x0c29, B:530:0x0c2d, B:532:0x0c35, B:533:0x0c3d, B:534:0x0c5d, B:536:0x0c68, B:538:0x0c83, B:540:0x0c89, B:542:0x0c8f, B:544:0x0c95, B:545:0x0c97, B:546:0x0c9c, B:547:0x0c9f, B:549:0x0ca3, B:551:0x0caf, B:552:0x0cb7, B:553:0x0ccb, B:554:0x0cf1, B:556:0x0d07, B:649:0x0d0f, B:650:0x0d13, B:652:0x0d19, B:655:0x0d30, B:657:0x0d46, B:658:0x0d5d, B:660:0x0d63, B:662:0x0d87, B:665:0x0d8e, B:667:0x0de6, B:562:0x0df1, B:564:0x0df7, B:565:0x0dff, B:567:0x0e03, B:569:0x0e09, B:572:0x0e11, B:576:0x0e1b, B:579:0x0e3b, B:581:0x0e52, B:582:0x0e61, B:583:0x0eb6, B:584:0x0eb9, B:586:0x0ec5, B:627:0x0f3e, B:629:0x0f44, B:630:0x0f4a, B:636:0x0f57, B:638:0x0f5d, B:643:0x0e9d, B:644:0x0e77, B:646:0x0e7d, B:648:0x0e87, B:673:0x0337, B:674:0x0320, B:301:0x0589, B:303:0x0591, B:305:0x059d, B:306:0x05a3, B:308:0x05af, B:409:0x05bb, B:410:0x05c3, B:411:0x05cc, B:413:0x05d2, B:415:0x05e8, B:418:0x05fa, B:588:0x0ecd, B:589:0x0ed8, B:591:0x0ede, B:594:0x0ef0, B:596:0x0ef4, B:598:0x0efc, B:600:0x0f0f, B:603:0x0f17, B:610:0x0f2e, B:611:0x0f31, B:621:0x0f34), top: B:4:0x0010, inners: #0, #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00b9 A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v313, types: [android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v10, types: [X.4lM] */
    /* JADX WARN: Type inference failed for: r11v16, types: [X.Irz, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v20, types: [com.instagram.feed.feeditem.SuggestedChannels, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v22, types: [X.5ig, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v13, types: [java.lang.Object, X.3Py] */
    /* JADX WARN: Type inference failed for: r14v15, types: [java.lang.Object, X.3CL] */
    /* JADX WARN: Type inference failed for: r14v17, types: [X.4yE, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v2, types: [X.4pw, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v21, types: [java.lang.Object, X.Iv3] */
    /* JADX WARN: Type inference failed for: r14v5, types: [java.lang.Object, X.Is0] */
    /* JADX WARN: Type inference failed for: r14v7, types: [java.lang.Object, X.4dV] */
    /* JADX WARN: Type inference failed for: r14v9, types: [java.lang.Object, X.YFD] */
    /* JADX WARN: Type inference failed for: r15v12, types: [X.5bh] */
    /* JADX WARN: Type inference failed for: r15v16, types: [X.IuF] */
    /* JADX WARN: Type inference failed for: r15v21, types: [X.IuK] */
    /* JADX WARN: Type inference failed for: r15v25, types: [X.4yI] */
    /* JADX WARN: Type inference failed for: r15v29, types: [X.4yH] */
    /* JADX WARN: Type inference failed for: r15v32, types: [com.instagram.feed.ui.state.IntentAwareAdPivotState] */
    /* JADX WARN: Type inference failed for: r15v33, types: [com.instagram.feed.ui.state.IntentAwareAdPivotState] */
    /* JADX WARN: Type inference failed for: r15v34, types: [com.instagram.feed.ui.state.IntentAwareAdPivotState, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r15v38, types: [X.IuG] */
    /* JADX WARN: Type inference failed for: r15v51 */
    /* JADX WARN: Type inference failed for: r15v52 */
    /* JADX WARN: Type inference failed for: r15v62 */
    /* JADX WARN: Type inference failed for: r15v63 */
    /* JADX WARN: Type inference failed for: r15v64 */
    /* JADX WARN: Type inference failed for: r15v65 */
    /* JADX WARN: Type inference failed for: r15v8, types: [X.IuJ] */
    /* JADX WARN: Type inference failed for: r1v147, types: [java.util.AbstractCollection, java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r1v148, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v150, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v56, types: [X.IuH] */
    /* JADX WARN: Type inference failed for: r1v60, types: [X.IuL] */
    /* JADX WARN: Type inference failed for: r1v62, types: [X.Xf0, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v7, types: [X.3q9, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v20, types: [X.FNu, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, X.304] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:571:0x0f28 -> B:567:0x0f23). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:573:0x0f2c -> B:568:0x0f2e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A0A(int r53) {
        /*
            Method dump skipped, instructions count: 4078
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65192xH.A0A(int):void");
    }

    public final void A0D(C5GM c5gm) {
        if (c5gm != this.A08) {
            this.A08 = c5gm;
            A0A(-1);
        }
    }

    public final boolean A0F() {
        C65312xT c65312xT = (C65312xT) ((AbstractC65202xI) this).A00;
        List list = this.A0f;
        C5GM c5gm = this.A08;
        C14360o3.A0B(c65312xT, 0);
        C14360o3.A0B(list, 1);
        if (c65312xT.A02 && c65312xT.A02() == 0 && list.isEmpty()) {
            if (c5gm == null || c5gm.A00 == null) {
                return true;
            }
            return false;
        }
        return false;
    }

    @Override // X.InterfaceC65262xO
    public final int B5m() {
        return ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A01.size();
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0039, code lost:
    
        return new android.util.Pair(r1, java.lang.Integer.valueOf(r3));
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [X.1qM] */
    /* JADX WARN: Type inference failed for: r1v3, types: [X.1qS, java.lang.Object] */
    @Override // X.InterfaceC65262xO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.util.Pair BLk() {
        /*
            r5 = this;
            X.2xW r4 = r5.A00
            X.2xV r4 = (X.AbstractC65332xV) r4
            r0 = 0
            X.C14360o3.A0B(r4, r0)
            java.util.List r0 = r4.A01
            int r3 = r0.size()
        Le:
            int r3 = r3 + (-1)
            r0 = -1
            if (r0 >= r3) goto L49
            java.util.List r0 = r4.A01
            java.lang.Object r2 = r0.get(r3)
            X.3XG r2 = (X.C3XG) r2
            X.1XV r1 = r2.A06
            X.1XV r0 = X.C1XV.A0Y
            if (r1 == r0) goto L3a
            X.1XV r0 = X.C1XV.A04
            if (r1 == r0) goto L3a
            X.1XV r0 = X.C1XV.A0C
            if (r1 != r0) goto Le
            X.1qS r1 = r2.A05
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.feed.feeditem.ClipsNetego"
            X.C14360o3.A0C(r1, r0)
        L30:
            java.lang.Integer r2 = java.lang.Integer.valueOf(r3)
            android.util.Pair r0 = new android.util.Pair
            r0.<init>(r1, r2)
            return r0
        L3a:
            X.1qS r0 = r2.A05
            X.1qM r1 = X.C3XH.A02(r0)
            if (r1 == 0) goto Le
            boolean r0 = r1.CdW()
            if (r0 == 0) goto Le
            goto L30
        L49:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65192xH.BLk():android.util.Pair");
    }

    @Override // X.InterfaceC65262xO
    public final Pair BLp() {
        C38321qM A02;
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        C14360o3.A0B(abstractC65332xV, 0);
        int size = abstractC65332xV.A01.size();
        while (true) {
            size--;
            if (-1 < size) {
                C3XG c3xg = (C3XG) abstractC65332xV.A01.get(size);
                if (c3xg.A06 == C1XV.A0Y && (A02 = C3XH.A02(c3xg.A05)) != null && !A02.CdW()) {
                    return new Pair(A02, Integer.valueOf(size));
                }
            } else {
                return null;
            }
        }
    }

    @Override // X.InterfaceC65222xK
    public final List BRE() {
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        C14360o3.A0B(abstractC65332xV, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : abstractC65332xV.A01) {
            C14360o3.A07(obj);
            C38321qM A02 = C3XH.A02(((C3XG) obj).A05);
            if (A02 != null) {
                arrayList.add(A02);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC65302xS
    public final View C13() {
        return this.A02;
    }

    @Override // X.InterfaceC65282xQ
    public final List CCN() {
        C1XV c1xv;
        AbstractC65332xV abstractC65332xV = (AbstractC65332xV) ((AbstractC65202xI) this).A00;
        C14360o3.A0B(abstractC65332xV, 0);
        ArrayList arrayList = new ArrayList();
        for (Object obj : abstractC65332xV.A01) {
            C14360o3.A07(obj);
            C3XG c3xg = (C3XG) obj;
            C38321qM A02 = C3XH.A02(c3xg.A05);
            if (A02 != null && ((c1xv = c3xg.A06) == C1XV.A0H || c1xv == C1XV.A0a || c1xv == C1XV.A0M)) {
                arrayList.add(A02);
            }
        }
        return arrayList;
    }

    @Override // X.InterfaceC65272xP
    public final /* bridge */ /* synthetic */ void ETA(InterfaceC686036x interfaceC686036x) {
        C685736u c685736u = (C685736u) interfaceC686036x;
        C14360o3.A0B(c685736u, 0);
        this.A0F.A08(c685736u);
        C65822yK c65822yK = this.A0N;
        InterfaceC692739n C9D = c685736u.C9D();
        InterfaceC690438q C9C = c685736u.C9C();
        c65822yK.A00 = new C693439u(C9D);
        c65822yK.A01.A00 = C9C;
        C65812yJ c65812yJ = this.A0K;
        InterfaceC692739n C9D2 = c685736u.C9D();
        InterfaceC690438q C9C2 = c685736u.C9C();
        c65812yJ.A00 = new C693439u(C9D2);
        c65812yJ.A02.A00 = C9C2;
        c65812yJ.A01 = c685736u;
        C65832yL c65832yL = this.A0E;
        c65832yL.A02 = c685736u;
        c65832yL.A01 = new C693439u(c685736u.C9D());
        c65832yL.A00 = new ViewOnClickListenerC693639w(c65832yL.A04, c65832yL.A02);
        C65792yH c65792yH = this.A0Q;
        c65792yH.A01 = c685736u;
        c65792yH.A00 = new C693439u(c685736u.C9D(), true);
        C65732yB c65732yB = this.A0M;
        InterfaceC692739n C9D3 = c685736u.C9D();
        c65732yB.A02 = c685736u;
        c65732yB.A01 = new C693439u(C9D3, true);
        this.A0H.A02 = c685736u;
        this.A0W.A00 = c685736u;
        C65622xy c65622xy = this.A0G;
        if (c65622xy != null) {
            c65622xy.A02(c685736u);
        }
        this.A0V.A00 = c685736u;
        this.A0a.A01 = c685736u;
        ((C66612zd) this.A0S.A0A.getValue()).A00 = this.A0X;
        C65862yO c65862yO = this.A0I;
        InterfaceC692739n C9D4 = c685736u.C9D();
        c65862yO.A01 = c685736u;
        c65862yO.A00 = new C693439u(C9D4, true);
        this.A0O.A00(c685736u, c685736u.C9D());
        this.A0D.A00 = c685736u;
    }

    @Override // X.InterfaceC65252xN
    public final void EVk(int i) {
        C65662y2 c65662y2 = this.A0p;
        if (c65662y2 != null && i != c65662y2.A03) {
            c65662y2.A03 = i;
            A0A(-1);
        }
    }

    @Override // X.InterfaceC65242xM
    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    @Override // X.C2US
    public final AnonymousClass302 getLithoPrepareHelperCallback() {
        C66772zu c66772zu = (C66772zu) this.A0m.getValue();
        if (c66772zu != null) {
            return c66772zu.A01;
        }
        return null;
    }

    public final int A01(int i) {
        Object item = getItem(i);
        if (item != null) {
            Iterator it = A07().iterator();
            int i2 = 0;
            while (it.hasNext()) {
                int i3 = i2 + 1;
                InterfaceC38381qS interfaceC38381qS = ((C3XG) it.next()).A05;
                InterfaceC38381qS A02 = C3XH.A02(interfaceC38381qS);
                if (A02 == null) {
                    A02 = interfaceC38381qS;
                }
                if (item.equals(A02)) {
                    return i2;
                }
                i2 = i3;
            }
        }
        return -1;
    }

    @Override // X.InterfaceC65282xQ
    public final Object EFR(int i) {
        C3XG A04 = A04(i);
        if (A04 == null) {
            return null;
        }
        ((AbstractC65332xV) ((AbstractC65202xI) this).A00).A0D(A04);
        A0A(-1);
        return A04;
    }

    @Override // X.C2UT, android.widget.Adapter
    public final int getCount() {
        return getViewCount();
    }

    @Override // X.C2US, X.C2UT, X.C2UU, android.widget.Adapter
    public final long getItemId(int i) {
        int A03 = C0f9.A03(1186329503);
        long itemId = super.getItemId(i);
        C0f9.A0A(-490435163, A03);
        return itemId;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x022b, code lost:
    
        if (((java.lang.Boolean) r6.A0z.CES(r6, X.C17280tP.A4G[191(0xbf, float:2.68E-43)])).booleanValue() != false) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public C65192xH(android.content.Context r22, androidx.fragment.app.Fragment r23, X.C62862tP r24, final com.instagram.common.session.UserSession r25, X.InterfaceC61352qx r26, final X.InterfaceC60442pS r27, X.C61512rE r28, X.C63242u1 r29, X.C65122xA r30, X.C61762rd r31, X.InterfaceC63342uH r32, X.InterfaceC60682pr r33, X.InterfaceC62602sz r34, X.C63232u0 r35) {
        /*
            Method dump skipped, instructions count: 559
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65192xH.<init>(android.content.Context, androidx.fragment.app.Fragment, X.2tP, com.instagram.common.session.UserSession, X.2qx, X.2pS, X.2rE, X.2u1, X.2xA, X.2rd, X.2uH, X.2pr, X.2sz, X.2u0):void");
    }
}
