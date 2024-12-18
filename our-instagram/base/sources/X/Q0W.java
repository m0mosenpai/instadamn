package X;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/* loaded from: classes10.dex */
public final class Q0W implements InterfaceC102764kD {
    public Integer A00;
    public Object A01;
    public String A02;
    public final Stack A03;
    public final Stack A04;
    public final C103134ko A05;
    public final C6FQ A06;
    public final C64468TFe A07;

    @Override // X.InterfaceC102764kD
    public final Integer Csy() {
        EnumC61126Rfg enumC61126Rfg;
        Integer num;
        this.A02 = null;
        this.A00 = null;
        Stack stack = this.A03;
        EnumC61126Rfg enumC61126Rfg2 = (EnumC61126Rfg) stack.peek();
        Stack stack2 = this.A04;
        Iterator it = (Iterator) stack2.peek();
        int ordinal = enumC61126Rfg2.ordinal();
        if (ordinal != 0) {
            if (ordinal != 1) {
                if (ordinal != 2) {
                    if (ordinal != 3) {
                        if (ordinal == 4) {
                            this.A01 = null;
                            if (it.hasNext()) {
                                this.A01 = it.next();
                            } else {
                                this.A00 = C05F.A01;
                                stack2.pop();
                                stack.pop();
                            }
                        }
                    } else {
                        this.A00 = C05F.A00;
                        stack.pop();
                        enumC61126Rfg = EnumC61126Rfg.ArrayReadValue;
                    }
                } else {
                    stack.pop();
                    stack.push(EnumC61126Rfg.ObjectReadName);
                }
                Object obj = this.A01;
                if (obj == null) {
                    num = C05F.A1I;
                } else if (obj instanceof Boolean) {
                    num = C05F.A1F;
                } else if (obj instanceof Number) {
                    num = C05F.A15;
                } else if (obj instanceof C1344465q) {
                    num = C05F.A0u;
                } else if (obj instanceof String) {
                    num = C05F.A0j;
                } else if (obj instanceof List) {
                    stack2.push(((List) obj).iterator());
                    stack.push(EnumC61126Rfg.ArrayReadValue);
                    num = C05F.A00;
                } else if (obj instanceof Map) {
                    stack2.push(((Map) obj).entrySet().iterator());
                    stack.push(EnumC61126Rfg.ObjectReadName);
                    num = C05F.A0C;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("unknown value type");
                    sb.append(obj);
                    throw new IllegalStateException(sb.toString());
                }
                this.A00 = num;
            } else {
                this.A01 = null;
                if (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    this.A02 = (String) entry.getKey();
                    this.A01 = entry.getValue();
                    this.A00 = C05F.A0Y;
                    stack.pop();
                    enumC61126Rfg = EnumC61126Rfg.ObjectReadValue;
                } else {
                    this.A00 = C05F.A0N;
                    stack.pop();
                    stack2.pop();
                }
            }
            return this.A00;
        }
        this.A00 = C05F.A0C;
        stack.pop();
        enumC61126Rfg = EnumC61126Rfg.ObjectReadName;
        stack.push(enumC61126Rfg);
        return this.A00;
    }

    @Override // X.InterfaceC102764kD
    public final Object Awa() {
        if (this.A05 != null) {
            C6FQ c6fq = this.A06;
            Object obj = this.A01;
            C14360o3.A0A(c6fq);
            AbstractC25225BEi.A1S(obj);
            return AbstractC103094kk.A00(c6fq, (String) obj);
        }
        throw AbstractC166987dD.A14("Attempted to get a delegate parser when none exists.");
    }

    @Override // X.InterfaceC102764kD
    public final String E3u() {
        return this.A02;
    }

    @Override // X.InterfaceC102764kD
    public final Integer E3x() {
        return this.A00;
    }

    @Override // X.InterfaceC102764kD
    public final InterfaceC1120053p E3y() {
        C64468TFe c64468TFe = this.A07;
        c64468TFe.A00 = this.A01;
        return c64468TFe;
    }

    @Override // X.InterfaceC102764kD
    public final void EmB() {
        Integer num = this.A00;
        Integer num2 = C05F.A00;
        if (num == num2 || num == C05F.A0C) {
            int i = 1;
            while (true) {
                Integer Csy = Csy();
                if (Csy != num2 && Csy != C05F.A0C) {
                    if (Csy == C05F.A01 || Csy == C05F.A0N) {
                        i--;
                    }
                } else {
                    i++;
                }
                if (i == 0) {
                    return;
                }
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [X.TFe, java.lang.Object] */
    public Q0W(C103134ko c103134ko, C6FQ c6fq, Iterator it) {
        Stack stack = new Stack();
        this.A04 = stack;
        Stack stack2 = new Stack();
        this.A03 = stack2;
        this.A07 = new Object();
        this.A06 = c6fq;
        stack.add(it);
        stack2.add(EnumC61126Rfg.ReadObject);
        this.A05 = c103134ko;
    }
}
