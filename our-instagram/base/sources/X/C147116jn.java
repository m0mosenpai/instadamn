package X;

import com.facebook.common.stringformat.StringFormatUtil;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* renamed from: X.6jn, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C147116jn {
    public final UserSession A00;
    public final InterfaceC114805Gn A01;
    public final InterfaceC11380iw A02;

    public C147116jn(InterfaceC11380iw interfaceC11380iw, UserSession userSession, InterfaceC114805Gn interfaceC114805Gn) {
        C14360o3.A0B(interfaceC114805Gn, 1);
        C14360o3.A0B(userSession, 2);
        this.A01 = interfaceC114805Gn;
        this.A00 = userSession;
        this.A02 = interfaceC11380iw;
    }

    public final void A00(InterfaceC81993lL interfaceC81993lL, String str, int i, boolean z) {
        LinkedHashSet linkedHashSet;
        LinkedHashMap linkedHashMap;
        long j;
        int i2 = i;
        C14360o3.A0B(interfaceC81993lL, 2);
        if (z) {
            UserSession userSession = this.A00;
            C06090Tz c06090Tz = C06090Tz.A05;
            long A01 = C18U.A01(c06090Tz, userSession, 36595191536355412L);
            if (A01 <= 0) {
                A01 = 20;
            }
            long A012 = C18U.A01(c06090Tz, userSession, 36595191536420949L);
            if (A012 <= 0) {
                A012 = 1;
            }
            linkedHashSet = new LinkedHashSet();
            if (i >= 0) {
                InterfaceC114805Gn interfaceC114805Gn = this.A01;
                C146286iR c146286iR = ((C146226iL) interfaceC114805Gn).A0C;
                int A00 = c146286iR.A00();
                for (int i3 = i2; i3 < A00; i3++) {
                    C41551w4 Blt = interfaceC114805Gn.Blt(i3);
                    if (Blt == null) {
                        String formatStrLocaleSafe = StringFormatUtil.formatStrLocaleSafe("Initial list size: %d, Updated list size: %d", Integer.valueOf(A00), Integer.valueOf(c146286iR.A00()));
                        C14360o3.A07(formatStrLocaleSafe);
                        C0w9.A03("ReelListAdapter ReelViewModel list changed from another thread", formatStrLocaleSafe);
                    } else if (!Blt.A0H.A1P && !Blt.A0N) {
                        if (!Blt.A0H.A0z(userSession)) {
                            String id = Blt.A0H.getId();
                            C14360o3.A07(id);
                            linkedHashSet.add(id);
                        }
                        if (i3 != i2) {
                            Integer num = Blt.A0H.A0e;
                            if (num != null) {
                                j = num.intValue();
                            } else {
                                j = 0;
                            }
                            A01 -= j;
                        }
                    }
                    if (linkedHashSet.size() >= A01 || (i3 > i2 + A012 && A01 <= 0)) {
                        break;
                    }
                }
            }
        } else {
            linkedHashSet = new LinkedHashSet();
            int i4 = i + 4 + 1;
            while (i2 < i4) {
                if (i2 > 0) {
                    InterfaceC114805Gn interfaceC114805Gn2 = this.A01;
                    if (i2 >= ((C146226iL) interfaceC114805Gn2).A0C.A00()) {
                        continue;
                    } else {
                        C41551w4 Blt2 = interfaceC114805Gn2.Blt(i2);
                        if (Blt2 != null) {
                            if (!Blt2.A0H.A0z(this.A00) && !Blt2.A0H.A1P && !Blt2.A0N) {
                                String id2 = Blt2.A0H.getId();
                                C14360o3.A07(id2);
                                linkedHashSet.add(id2);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    }
                }
                i2++;
            }
        }
        if (!linkedHashSet.isEmpty()) {
            C82013lN A002 = AbstractC82003lM.A00(this.A00);
            if (str != null) {
                linkedHashMap = AbstractC06930Yk.A07(new C09530e4(AbstractC43591JPw.A00(199), str));
            } else {
                linkedHashMap = null;
            }
            A002.A01(C3G5.A05, null, this.A02.getModuleName(), linkedHashMap, linkedHashSet);
            Iterator it = linkedHashSet.iterator();
            while (it.hasNext()) {
                A002.A05(interfaceC81993lL, (String) it.next(), null, false);
            }
        }
    }
}
