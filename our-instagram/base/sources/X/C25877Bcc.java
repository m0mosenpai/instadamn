package X;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import com.instagram.archive.data.HighlightsSettingsRepository;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;
import com.instagram.pendingmedia.store.PendingMediaStore;
import com.instagram.realtimeclient.RealtimeSubscription;
import com.instagram.reels.store.ReelStore;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: X.Bcc, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C25877Bcc extends AbstractC52922bZ {
    public C47Z A00;
    public List A01;
    public Map A02;
    public String A03;
    public final int A04;
    public final HighlightsSettingsRepository A05;
    public final C27266C1j A06;
    public final UserSession A07;
    public final InterfaceC65982ya A08;
    public final C156216zq A09;
    public final C64012vM A0A;
    public final String A0B;
    public final java.util.Set A0C;
    public final C19L A0D;
    public final C05A A0E;
    public final C0UO A0F;
    public final InterfaceC11380iw A0G;
    public final String A0H;

    public static final Reel A00(C25877Bcc c25877Bcc) {
        Object obj;
        UserSession userSession = c25877Bcc.A07;
        C1OU c1ou = C1OU.$redex_init_class;
        Iterator it = AbstractC001800i.A0U(AbstractC41111vK.A00(userSession).A00.values()).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                if (((Reel) obj).A0l()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (Reel) obj;
    }

    public static final void A02(C25877Bcc c25877Bcc, Reel reel) {
        int size;
        ImageUrl A07;
        boolean z;
        Object value;
        C26057Bfk c26057Bfk;
        String id;
        Bitmap bitmap;
        String str;
        Bitmap bitmap2;
        Object value2;
        C26057Bfk c26057Bfk2;
        C26009Bex c26009Bex;
        if (reel != null) {
            C05A c05a = c25877Bcc.A0E;
            C26009Bex c26009Bex2 = ((C26057Bfk) c05a.getValue()).A01;
            Integer num = reel.A0e;
            if (num != null) {
                size = num.intValue();
            } else {
                size = reel.A0O(c25877Bcc.A07).size();
            }
            if (size == 0) {
                A07 = null;
            } else {
                A07 = reel.A07();
            }
            UserSession userSession = c25877Bcc.A07;
            if (C41661wG.A00(userSession).A01(reel) > 0 || (c26009Bex2 != null && c26009Bex2.A01 != null)) {
                z = true;
            } else {
                z = false;
            }
            do {
                value = c05a.getValue();
                c26057Bfk = (C26057Bfk) value;
                id = reel.getId();
                C14360o3.A07(id);
                C47Z c47z = c25877Bcc.A00;
                if (c47z != null && c47z.A0m() && c26009Bex2 != null) {
                    bitmap = c26009Bex2.A01;
                } else {
                    bitmap = null;
                }
            } while (!c05a.AIi(value, C26057Bfk.A00(null, c26057Bfk, new C26009Bex(bitmap, A07, reel, id, null, size, false, false, z), null, 239, false, false)));
            C47Z c47z2 = c25877Bcc.A00;
            if (c47z2 != null) {
                c47z2.A0X(c25877Bcc.A08);
            }
            c25877Bcc.A00 = null;
            PendingMediaStore A00 = C25A.A00(userSession);
            ArrayList A05 = A00.A05(C05F.A0N);
            ArrayList A1E = AbstractC166987dD.A1E();
            Iterator it = A05.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (((C47Z) next).A0m()) {
                    A1E.add(next);
                }
            }
            ArrayList A052 = A00.A05(C05F.A0C);
            ArrayList A1E2 = AbstractC166987dD.A1E();
            Iterator it2 = A052.iterator();
            while (it2.hasNext()) {
                Object next2 = it2.next();
                if (((C47Z) next2).A0m()) {
                    A1E2.add(next2);
                }
            }
            ArrayList A0S = AbstractC001800i.A0S(A1E2, A1E);
            if (!A0S.isEmpty()) {
                C47Z c47z3 = (C47Z) AbstractC001800i.A0I(A0S);
                C188538Ws c188538Ws = c47z3.A1Y;
                if (c188538Ws == null || (str = c188538Ws.A00) == null) {
                    str = "myWeek";
                }
                if (AbstractC001900j.A0a(str, "myWeek", false)) {
                    bitmap2 = BitmapFactory.decodeFile(c47z3.A33);
                } else {
                    bitmap2 = null;
                }
                c47z3.A0W(c25877Bcc.A08);
                c25877Bcc.A00 = c47z3;
                do {
                    value2 = c05a.getValue();
                    c26057Bfk2 = (C26057Bfk) value2;
                    C26009Bex c26009Bex3 = c26057Bfk2.A01;
                    if (c26009Bex3 != null) {
                        String str2 = c47z3.A3t;
                        String str3 = c26009Bex3.A05;
                        Reel reel2 = c26009Bex3.A03;
                        ImageUrl imageUrl = c26009Bex3.A02;
                        boolean z2 = c26009Bex3.A07;
                        int i = c26009Bex3.A00;
                        C14360o3.A0B(str3, 0);
                        C14360o3.A0B(reel2, 1);
                        c26009Bex = new C26009Bex(bitmap2, imageUrl, reel2, str3, str2, i, z2, true, true);
                    } else {
                        c26009Bex = null;
                    }
                } while (!c05a.AIi(value2, C26057Bfk.A00(null, c26057Bfk2, c26009Bex, null, 239, false, false)));
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x00fc, code lost:
    
        if (r19 != null) goto L42;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A03(X.C25877Bcc r41, java.lang.String r42) {
        /*
            Method dump skipped, instructions count: 441
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25877Bcc.A03(X.Bcc, java.lang.String):void");
    }

    public static final void A04(C25877Bcc c25877Bcc, boolean z) {
        if (!z || ((C26057Bfk) c25877Bcc.A0E.getValue()).A01 == null) {
            A02(c25877Bcc, A00(c25877Bcc));
            if (!z) {
                return;
            }
        }
        C82013lN A00 = AbstractC82003lM.A00(c25877Bcc.A07);
        String str = c25877Bcc.A0B;
        A00.A00(C3G5.A0B, new C29358Cwr(c25877Bcc, 0), str, "reel_highlights_updates_hub", AbstractC06930Yk.A07(AbstractC25230BEn.A1b(AbstractC111324zv.A00(943), RealtimeSubscription.GRAPHQL_MQTT_VERSION)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x006c, code lost:
    
        if (X.C14360o3.A0K(r8, r6) == false) goto L29;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void A05(java.lang.String r19) {
        /*
            r18 = this;
            r4 = r18
            java.lang.String r0 = r4.A03
            r3 = r19
            if (r0 == 0) goto Lb
            if (r19 == 0) goto Lb
            return
        Lb:
            r10 = 0
            if (r19 == 0) goto La7
            java.util.Map r0 = r4.A02
            java.util.Iterator r2 = X.AbstractC166997dE.A16(r0)
        L14:
            boolean r0 = r2.hasNext()
            if (r0 == 0) goto La5
            java.lang.Object r1 = r2.next()
            r0 = r1
            X.3AY r0 = (X.C3AY) r0
            java.lang.Object r0 = r0.A01
            com.instagram.model.reels.Reel r0 = (com.instagram.model.reels.Reel) r0
            java.lang.String r0 = r0.getId()
            boolean r0 = X.C14360o3.A0K(r0, r3)
            if (r0 == 0) goto L14
        L2f:
            X.3AY r1 = (X.C3AY) r1
            if (r1 == 0) goto La7
            java.lang.Object r2 = r1.A00
            X.Mrw r2 = (X.C51665Mrw) r2
        L37:
            X.05A r1 = r4.A0E
        L39:
            java.lang.Object r5 = r1.getValue()
            r0 = r5
            X.Bfk r0 = (X.C26057Bfk) r0
            X.5Hc r6 = r0.A02
            java.util.ArrayList r7 = X.AbstractC167017dG.A0q(r6)
            java.util.Iterator r9 = r6.iterator()
        L4a:
            boolean r6 = r9.hasNext()
            if (r6 == 0) goto L88
            java.lang.Object r11 = r9.next()
            X.DgY r11 = (X.InterfaceC30797DgY) r11
            boolean r6 = r11 instanceof X.C26692BqZ
            if (r6 == 0) goto L82
            X.BqZ r11 = (X.C26692BqZ) r11
            X.Mrw r12 = r11.A01
            if (r12 == 0) goto L6e
            java.lang.String r8 = r12.A04
            if (r2 == 0) goto L86
            java.lang.String r6 = r2.A04
        L66:
            boolean r6 = X.C14360o3.A0K(r8, r6)
            r16 = 1
            if (r6 != 0) goto L70
        L6e:
            r16 = 0
        L70:
            int r15 = r11.A00
            java.lang.String r13 = r11.A03
            java.lang.String r14 = r11.A02
            boolean r6 = r11.A05
            X.AbstractC167017dG.A1P(r13, r14)
            X.BqZ r11 = new X.BqZ
            r17 = r6
            r11.<init>(r12, r13, r14, r15, r16, r17)
        L82:
            r7.add(r11)
            goto L4a
        L86:
            r6 = r10
            goto L66
        L88:
            X.5Hc r14 = X.AbstractC133095zb.A00(r7)
            r16 = 0
            r11 = 0
            r15 = 191(0xbf, float:2.68E-43)
            r13 = r11
            r17 = r16
            r12 = r0
            X.Bfk r0 = X.C26057Bfk.A00(r11, r12, r13, r14, r15, r16, r17)
            boolean r0 = r1.AIi(r5, r0)
            if (r0 == 0) goto L39
            A03(r4, r3)
            r4.A03 = r3
            return
        La5:
            r1 = r10
            goto L2f
        La7:
            r2 = r10
            goto L37
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C25877Bcc.A05(java.lang.String):void");
    }

    @Override // X.AbstractC52922bZ
    public final void onCleared() {
        C47Z c47z = this.A00;
        if (c47z != null) {
            c47z.A0X(this.A08);
        }
        this.A00 = null;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.6zr, java.lang.Object] */
    public C25877Bcc(C27266C1j c27266C1j, InterfaceC11380iw interfaceC11380iw, UserSession userSession, String str, int i) {
        InterfaceC30798DgZ interfaceC30798DgZ;
        boolean A1V = AbstractC167007dF.A1V(interfaceC11380iw);
        C14360o3.A0B(str, 3);
        this.A07 = userSession;
        this.A0G = interfaceC11380iw;
        this.A0H = str;
        this.A06 = c27266C1j;
        this.A04 = i;
        this.A0D = AnonymousClass194.A02(C12L.A00.AOT(-18, 3));
        this.A05 = AbstractC156236zs.A00(new Object(), userSession);
        C156216zq A00 = AbstractC156206zp.A00(userSession);
        this.A09 = A00;
        this.A02 = AbstractC06930Yk.A0E();
        C16930sl c16930sl = C16930sl.A00;
        this.A01 = c16930sl;
        this.A08 = new C50729MaV(this, 0);
        InterfaceC19630xq interfaceC19630xq = A00.A00;
        if (!interfaceC19630xq.getBoolean("seen_my_week_nux", false) && !interfaceC19630xq.getBoolean("my_week_enabled", false)) {
            interfaceC30798DgZ = C29097CsO.A00;
        } else {
            interfaceC30798DgZ = C29095CsM.A00;
        }
        boolean z = interfaceC19630xq.getBoolean("my_week_enabled", false);
        C008002u A1H = AbstractC25225BEi.A1H(new C26057Bfk(interfaceC30798DgZ, null, C5HZ.A01, A01(this, c16930sl), A1V, false, z, false));
        this.A0E = A1H;
        this.A0F = AbstractC208910l.A02(A1H);
        this.A0C = new LinkedHashSet();
        this.A0A = C1OU.A02(interfaceC11380iw, userSession, null);
        this.A0B = AnonymousClass001.A0R("myWeek:", AbstractC166997dE.A0Y(userSession).getId());
        A06(A1V);
        AbstractC18560vj.A03(AbstractC141776au.A00(this), new MWG(11, this, c27266C1j.A03));
    }

    public static final C5Hc A01(C25877Bcc c25877Bcc, List list) {
        C51665Mrw c51665Mrw;
        Object c26691BqY;
        Calendar calendar = Calendar.getInstance();
        int firstDayOfWeek = calendar.getFirstDayOfWeek();
        int actualMaximum = calendar.getActualMaximum(7);
        int i = calendar.get(7);
        ArrayList A1N = AbstractC16960so.A1N(C29094CsL.A00);
        ArrayList A1E = AbstractC166987dD.A1E();
        calendar.add(5, -actualMaximum);
        UserSession userSession = c25877Bcc.A07;
        ReelStore A03 = ReelStore.A03(userSession);
        C14360o3.A07(A03);
        c25877Bcc.A02 = AbstractC54858ONj.A00(A03, AbstractC166987dD.A10(userSession), C05F.A00, null, list);
        int i2 = (((firstDayOfWeek + actualMaximum) - i) % actualMaximum) + actualMaximum;
        if (i2 >= 0) {
            int i3 = 0;
            int i4 = 0;
            while (true) {
                int i5 = calendar.get(5);
                String str = DateFormatSymbols.getInstance().getShortWeekdays()[calendar.get(7)];
                Calendar calendar2 = Calendar.getInstance();
                while (i3 < list.size()) {
                    c51665Mrw = (C51665Mrw) list.get(i3);
                    C14360o3.A0A(calendar2);
                    Calendar calendar3 = Calendar.getInstance(TimeZone.getTimeZone("UTC"));
                    calendar3.setTime(new Date(c51665Mrw.A01 * 1000));
                    int i6 = calendar3.get(1);
                    int i7 = calendar3.get(2);
                    int i8 = calendar3.get(5);
                    calendar2.clear();
                    calendar2.set(i6, i7, i8, 0, 0);
                    if (calendar.get(5) != calendar2.get(5)) {
                        if (calendar2.getTimeInMillis() > calendar.getTimeInMillis()) {
                            break;
                        }
                        i3++;
                    } else {
                        break;
                    }
                }
                c51665Mrw = null;
                String displayName = calendar.getDisplayName(7, 2, Locale.getDefault());
                if (displayName == null) {
                    displayName = str;
                }
                if (i4 <= actualMaximum) {
                    C14360o3.A0A(str);
                    boolean A1P = AbstractC167007dF.A1P(i4, actualMaximum);
                    C14360o3.A0A(displayName);
                    c26691BqY = new C26692BqZ(c51665Mrw, str, displayName, i5, false, A1P);
                } else {
                    C14360o3.A0A(str);
                    C14360o3.A0A(displayName);
                    c26691BqY = new C26691BqY(i5, str, displayName);
                }
                A1N.add(c26691BqY);
                if (c51665Mrw != null) {
                    A1E.add(c51665Mrw);
                }
                calendar.add(5, 1);
                if (i4 == i2) {
                    break;
                }
                i4++;
            }
        }
        return AbstractC133095zb.A00(A1N);
    }

    public final void A06(boolean z) {
        Object value;
        A04(this, z);
        if (z) {
            C05A c05a = this.A0E;
            do {
                value = c05a.getValue();
            } while (!c05a.AIi(value, C26057Bfk.A00(null, (C26057Bfk) value, null, null, 254, true, false)));
            C27266C1j c27266C1j = this.A06;
            C19L c19l = ((C4A7) c27266C1j).A01;
            PZW pzw = new PZW((Object) c27266C1j, (InterfaceC23621Ds) null, 2, false);
            AnonymousClass191 anonymousClass191 = AnonymousClass191.A00;
            AbstractC23641Du.A05(anonymousClass191, new MBq(this, null, 9), AbstractC25235BEs.A0W(this, anonymousClass191, pzw, c19l));
            return;
        }
        A03(this, null);
    }
}
