package X;

import android.text.Editable;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: X.PyC, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58585PyC {
    public final Comparator A00 = C58654PzR.A00;

    public static void A01(AbstractCollection abstractCollection, Matcher matcher, int i) {
        abstractCollection.add(new C58663Pza(i + matcher.start(1), i + matcher.end(1)));
    }

    public final ArrayList A02(Editable editable, List list) {
        List singletonList;
        C14360o3.A0B(editable, 0);
        C14360o3.A0B(list, 1);
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Py9 py9 = (Py9) it.next();
            Matcher matcher = py9.A03.matcher(editable);
            C14360o3.A07(matcher);
            while (matcher.find()) {
                int start = matcher.start();
                int end = matcher.end();
                boolean z = py9.A05;
                C58663Pza c58663Pza = new C58663Pza(matcher.start(1), matcher.end(1));
                if (z) {
                    singletonList = AbstractC16960so.A1Q(c58663Pza, new C58663Pza(matcher.start(matcher.groupCount()), matcher.end(matcher.groupCount())));
                } else {
                    singletonList = Collections.singletonList(c58663Pza);
                    C14360o3.A07(singletonList);
                }
                arrayList.add(new C58664Pzb(py9, singletonList, start, end));
            }
        }
        return arrayList;
    }

    public final ArrayList A03(Editable editable, List list, boolean z) {
        int i;
        C01L A1I;
        List list2;
        C14360o3.A0B(list, 2);
        ArrayList A02 = A02(editable, list);
        Collections.sort(A02, this.A00);
        int length = editable.length();
        LinkedList A11 = AbstractC58318PtA.A11();
        ArrayList A1E = AbstractC166987dD.A1E();
        Iterator it = A02.iterator();
        int i2 = 0;
        int i3 = 0;
        while (it.hasNext()) {
            C58664Pzb c58664Pzb = (C58664Pzb) it.next();
            while (true) {
                int i4 = c58664Pzb.A01;
                if (i4 > length) {
                    if (AbstractC166987dD.A1b(A11)) {
                        length = AbstractC166987dD.A0H(A11.removeFirst());
                    } else {
                        throw AbstractC166987dD.A14("Start index of range is beyond end of text");
                    }
                } else if (i2 <= i4 && (i = c58664Pzb.A00) <= length) {
                    Py9 py9 = c58664Pzb.A02;
                    List ANE = py9.A01.ANE(new C62577SHc(editable, i4, i, z));
                    if (py9.A02 == C05F.A04) {
                        editable.setSpan(ANE.get(i3), i4, i, 33);
                        i3++;
                    } else {
                        Iterator it2 = ANE.iterator();
                        while (it2.hasNext()) {
                            editable.setSpan(it2.next(), i4, i, 33);
                        }
                    }
                    switch (((C58525Pwt) py9.A00).A00) {
                        case 0:
                            list2 = c58664Pzb.A03;
                            break;
                        case 1:
                            Matcher A00 = A00(editable, "(^ *[*-] ?)(.*?$)", i4, i);
                            A1I = C0eM.A1I();
                            while (A00.find()) {
                                A01(A1I, A00, i4);
                            }
                            break;
                        case 2:
                            Matcher A002 = A00(editable, "(^#\\s)(.*?$)", i4, i);
                            A1I = C0eM.A1I();
                            while (A002.find()) {
                                A01(A1I, A002, i4);
                            }
                            break;
                        case 3:
                            Pattern compile = Pattern.compile("\\[([^\\]]+)\\]");
                            Pattern compile2 = Pattern.compile(".*\\(([^)]+)\\)");
                            Matcher matcher = compile.matcher(editable.subSequence(i4, i));
                            Matcher matcher2 = compile2.matcher(editable.subSequence(i4, i));
                            C14360o3.A07(matcher2);
                            A1I = C0eM.A1I();
                            while (matcher2.find() && matcher.find()) {
                                A1I.add(new C58663Pza((i4 + matcher.start(1)) - 1, i4 + matcher.start(1)));
                                A1I.add(new C58663Pza(i4 + matcher.end(1), matcher.end(1) + i4 + 1));
                                A1I.add(new C58663Pza((i4 + matcher2.start(1)) - 1, matcher2.end(1) + i4 + 1));
                            }
                        case 4:
                            Matcher A003 = A00(editable, "(^> ?)(.*?$)", i4, i);
                            A1I = C0eM.A1I();
                            while (A003.find()) {
                                A01(A1I, A003, i4);
                            }
                            break;
                        case 5:
                            Matcher A004 = A00(editable, "(^ *([1-9][0-9]?)\\.\\s ?)(.*?$)", i4, i);
                            A1I = C0eM.A1I();
                            while (A004.find()) {
                                A01(A1I, A004, i4);
                            }
                            break;
                        default:
                            Matcher A005 = A00(editable, "(^([1-9][0-9]?)\\.\\s ?)(.*?$)", i4, i);
                            A1I = C0eM.A1I();
                            while (A005.find()) {
                                A01(A1I, A005, i4);
                            }
                            break;
                    }
                    list2 = C0eM.A1J(A1I);
                    A1E.addAll(list2);
                    if (py9.A04) {
                        A11.addFirst(Integer.valueOf(length));
                        i2 = i4 + 1;
                        length = i - (AbstractC43593JPy.A1Z(c58664Pzb.A03.size(), 2) ? 1 : 0);
                    } else {
                        i2 = i;
                    }
                }
            }
        }
        return A1E;
    }

    public static Matcher A00(CharSequence charSequence, String str, int i, int i2) {
        return Pattern.compile(str, 8).matcher(charSequence.subSequence(i, i2));
    }
}
