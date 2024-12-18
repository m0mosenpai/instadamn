package X;

import android.content.Context;
import android.text.Editable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes10.dex */
public final class Py8 {
    public java.util.Set A00;
    public final int A01;
    public final Context A02;
    public final C51737MtK A03;
    public final C51608Mr0 A04;
    public final Py9 A05;
    public final Py9 A06;
    public final Py9 A07;
    public final Py9 A08;
    public final Py9 A09;
    public final Py9 A0A;
    public final Py9 A0B;
    public final Py9 A0C;
    public final Py9 A0D;
    public final C58585PyC A0E;
    public final Integer A0F;
    public final List A0G;
    public final InterfaceC09390do A0H;
    public final InterfaceC09390do A0I;
    public final InterfaceC09390do A0J;
    public final InterfaceC09390do A0K;
    public final List A0L;

    public final Editable A00(CharSequence charSequence) {
        int i;
        C14360o3.A0B(charSequence, 0);
        Editable newEditable = Editable.Factory.getInstance().newEditable(charSequence);
        C58585PyC c58585PyC = this.A0E;
        C14360o3.A0A(newEditable);
        ArrayList A02 = c58585PyC.A02(newEditable, this.A0G);
        ArrayList arrayList = new ArrayList();
        Iterator it = A02.iterator();
        while (it.hasNext()) {
            Iterator it2 = ((C58664Pzb) it.next()).A03.iterator();
            while (it2.hasNext()) {
                arrayList.add(it2.next());
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            Object next = it3.next();
            if (hashSet.add(Integer.valueOf(((C58663Pza) next).A01))) {
                arrayList2.add(next);
            }
        }
        ArrayList arrayList3 = new ArrayList(arrayList2);
        HashSet hashSet2 = new HashSet();
        ArrayList arrayList4 = new ArrayList();
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            Object next2 = it4.next();
            if (hashSet2.add(Integer.valueOf(((C58663Pza) next2).A00))) {
                arrayList4.add(next2);
            }
        }
        ArrayList arrayList5 = new ArrayList(arrayList4);
        C01T.A1D(arrayList5, C2BS.A01());
        Iterator it5 = arrayList5.iterator();
        while (it5.hasNext()) {
            C58663Pza c58663Pza = (C58663Pza) it5.next();
            int i2 = c58663Pza.A01;
            if (i2 >= 0 && i2 < (i = c58663Pza.A00) && i <= newEditable.length()) {
                newEditable.delete(i2, i);
            }
        }
        return newEditable;
    }

    public final void A01(Editable editable, boolean z) {
        C14360o3.A0B(editable, 0);
        ArrayList A03 = this.A0E.A03(editable, AbstractC001800i.A0S(this.A0L, this.A0G), z);
        Comparator reverseOrder = Collections.reverseOrder();
        C14360o3.A07(reverseOrder);
        for (C58663Pza c58663Pza : AbstractC001800i.A0g(A03, reverseOrder)) {
            int i = c58663Pza.A00;
            if (i <= editable.length()) {
                editable.delete(c58663Pza.A01, i);
            }
        }
        int length = editable.length();
        int i2 = 0;
        while (i2 < length && AbstractC58319PtB.A1T(editable, i2)) {
            i2++;
        }
        int i3 = length;
        while (i3 > i2 && AbstractC58319PtB.A1T(editable, i3 - 1)) {
            i3--;
        }
        if (i3 < length) {
            editable.delete(i3, length);
        }
        if (i2 > 0) {
            editable.delete(0, i2);
        }
    }

    public Py8(Context context, C51737MtK c51737MtK, C51608Mr0 c51608Mr0, Integer num, int i, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        Py9 py9;
        Py9 py92;
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Py9 py93;
        Py9 py94;
        this.A02 = context;
        this.A01 = i;
        this.A0F = num;
        this.A03 = c51737MtK;
        this.A04 = c51608Mr0;
        Integer num2 = C05F.A00;
        Pattern compile = Pattern.compile(z6 ? "(?<=[\\s_~'\"(]|^)(\\*\\*)(\\S(?:.*?\\S)??)(\\*\\*)(?=[\\s_~,.;:!?'\")]|$)" : "(?<=[\\s_~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s_~,.;:!?'\")]|$)");
        C14360o3.A07(compile);
        C58650PzN c58650PzN = C58650PzN.A00;
        InterfaceC65235TgR interfaceC65235TgR = Py9.A06;
        this.A05 = new Py9(interfaceC65235TgR, c58650PzN, num2, compile, true, true);
        Integer num3 = C05F.A01;
        Pattern compile2 = Pattern.compile("(^ *[*-]\\s.*$)", 8);
        C14360o3.A07(compile2);
        this.A06 = new Py9(new C58525Pwt(1), new Py7(this, 0), num3, compile2, true, false);
        Integer num4 = C05F.A0C;
        Pattern compile3 = Pattern.compile("(^([1-9][0-9]?)\\.\\s.*$)", 8);
        C14360o3.A07(compile3);
        this.A0B = new Py9(new C58525Pwt(6), new Py7(this, 2), num4, compile3, true, false);
        if (c51608Mr0 != null) {
            Integer num5 = C05F.A0N;
            Pattern compile4 = Pattern.compile("(^ *([1-9][0-9]?)\\.\\s.*$)", 8);
            C14360o3.A07(compile4);
            py9 = new Py9(new C58525Pwt(5), new Py7(this, 1), num5, compile4, true, false);
        } else {
            py9 = null;
        }
        this.A0A = py9;
        Integer num6 = C05F.A0Y;
        Pattern compile5 = Pattern.compile(z6 ? "(?<=[\\s*~'\"(]|^)(\\*)(\\S(?:.*?\\S)??)(\\*)(?=[\\s*~,.;:!?'\")]|$)" : "(?<=[\\s*~'\"(]|^)(_)(\\S(?:.*?\\S)??)(_)(?=[\\s*~,.;:!?'\")]|$)");
        C14360o3.A07(compile5);
        this.A07 = new Py9(interfaceC65235TgR, C58651PzO.A00, num6, compile5, true, true);
        Integer num7 = C05F.A0j;
        Pattern compile6 = Pattern.compile(z6 ? "(?<=[\\s*_'\"(]|^)(~~)(\\S(?:.*?\\S)??)(~~)(?=[\\s*_,.;:!?'\")]|$)" : "(?<=[\\s*_'\"(]|^)(~)(\\S(?:.*?\\S)??)(~)(?=[\\s*_,.;:!?'\")]|$)");
        C14360o3.A07(compile6);
        this.A0D = new Py9(interfaceC65235TgR, C58652PzP.A00, num7, compile6, true, true);
        Integer num8 = C05F.A0u;
        Pattern compile7 = Pattern.compile("(?<=[\\s*_'\"(]|^)(```)(\\S(?:.*?\\S)??)(```)(?=[\\s*_,.;:!?'\")]|$)");
        C14360o3.A07(compile7);
        this.A09 = new Py9(interfaceC65235TgR, C58653PzQ.A00, num8, compile7, true, true);
        Integer num9 = C05F.A15;
        Pattern compile8 = Pattern.compile("");
        C14360o3.A07(compile8);
        this.A0C = new Py9(interfaceC65235TgR, new C58583PyA(i3), num9, compile8, true, true);
        EnumC09460dv enumC09460dv = EnumC09460dv.A02;
        this.A0H = AbstractC09440dt.A00(enumC09460dv, new C58472Pvx(i4, 2));
        this.A0K = AbstractC09440dt.A00(enumC09460dv, C58586PyD.A00);
        this.A0I = AbstractC09440dt.A00(enumC09460dv, new C58584PyB(this, i2, i5, i6, 0));
        this.A0J = AbstractC09440dt.A00(enumC09460dv, new C58584PyB(this, i2, i5, i6, 1));
        Integer num10 = C05F.A04;
        Pattern compile9 = Pattern.compile("\\[([^]]+?)]\\(([^)]+)\\)");
        C14360o3.A07(compile9);
        this.A08 = new Py9(new C58525Pwt(3), new JXV(this), num10, compile9, true, false);
        Py9 py95 = this.A05;
        Py9 py96 = this.A07;
        Py9 py97 = this.A0D;
        if (z4) {
            py92 = this.A09;
        } else {
            py92 = null;
        }
        if (z) {
            obj = this.A0K.getValue();
        } else {
            obj = null;
        }
        Py9 py98 = (Py9) obj;
        if (z) {
            obj2 = this.A0H.getValue();
        } else {
            obj2 = null;
        }
        Py9 py99 = (Py9) obj2;
        if (z2) {
            obj3 = this.A0J.getValue();
        } else {
            obj3 = null;
        }
        Py9 py910 = (Py9) obj3;
        if (z2) {
            obj4 = this.A0I.getValue();
        } else {
            obj4 = null;
        }
        this.A0G = AbstractC16960so.A1R(py95, py96, py97, py92, py98, py99, py910, (Py9) obj4, z5 ? this.A08 : null);
        Py9 py911 = null;
        if (z3) {
            py93 = this.A06;
        } else {
            py93 = null;
        }
        if (!z3) {
            py94 = null;
        } else {
            C51608Mr0 c51608Mr02 = this.A04;
            if (c51608Mr02 != null && c51608Mr02.A02) {
                py94 = this.A0A;
            } else {
                py94 = this.A0B;
            }
        }
        C51737MtK c51737MtK2 = this.A03;
        if (c51737MtK2 != null) {
            int i7 = c51737MtK2.A01;
            int i8 = c51737MtK2.A00;
            Integer num11 = C05F.A05;
            Pattern compile10 = Pattern.compile("(^#\\s\\S.*$)", 8);
            C14360o3.A07(compile10);
            py911 = new Py9(new C58525Pwt(2), new T2E(i7, i8), num11, compile10, false, false);
        }
        this.A0L = AbstractC16960so.A1R(py93, py94, py911);
        this.A0E = new C58585PyC();
    }
}
