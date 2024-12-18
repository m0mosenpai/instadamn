package X;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.6NN, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6NN implements C6NO {
    public float A00;
    public float A01;
    public AnonymousClass583 A02 = AnonymousClass583.Rtl;
    public final /* synthetic */ C6NM A03;

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ int EL8(float f) {
        return AbstractC119105aS.A01(this, f);
    }

    @Override // X.C57y
    public final /* synthetic */ float EqG(long j) {
        return AbstractC122655h0.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqI(int i) {
        return i / this.A00;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long EqJ(long j) {
        return AbstractC119105aS.A03(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqS(long j) {
        return AbstractC119105aS.A00(this, j);
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7k(long j) {
        return AbstractC119105aS.A04(this, j);
    }

    @Override // X.C57y
    public final /* synthetic */ long F7l(float f) {
        return AbstractC122655h0.A01(this, f);
    }

    public C6NN(C6NM c6nm) {
        this.A03 = c6nm;
    }

    @Override // X.InterfaceC1128957x
    public final float Awk() {
        return this.A00;
    }

    @Override // X.C57y
    public final float B7e() {
        return this.A01;
    }

    @Override // X.InterfaceC1131259a
    public final boolean CXp() {
        Integer num = this.A03.A09.A0U.A06;
        if (num != C05F.A0N && num != C05F.A01) {
            return false;
        }
        return true;
    }

    @Override // X.C59Z
    public final /* synthetic */ InterfaceC119205ac Cgx(final Map map, final InterfaceC16660sJ interfaceC16660sJ, final int i, final int i2) {
        if ((i & (-16777216)) == 0 && ((-16777216) & i2) == 0) {
            final C6NM c6nm = this.A03;
            return new InterfaceC119205ac(this) { // from class: X.6OJ
                public final /* synthetic */ C6NN A02;

                {
                    this.A02 = this;
                }

                @Override // X.InterfaceC119205ac
                public final Map Aaw() {
                    return map;
                }

                @Override // X.InterfaceC119205ac
                public final InterfaceC16660sJ Bpq() {
                    return null;
                }

                @Override // X.InterfaceC119205ac
                public final void E4Q() {
                    InterfaceC16660sJ interfaceC16660sJ2;
                    C59V c59v;
                    if (this.A02.CXp() && (c59v = c6nm.A09.A0W.A06.A00) != null) {
                        interfaceC16660sJ2 = interfaceC16660sJ;
                    } else {
                        interfaceC16660sJ2 = interfaceC16660sJ;
                        c59v = c6nm.A09.A0W.A06;
                    }
                    interfaceC16660sJ2.invoke(c59v.A05);
                }

                @Override // X.InterfaceC119205ac
                public final int getHeight() {
                    return i2;
                }

                @Override // X.InterfaceC119205ac
                public final int getWidth() {
                    return i;
                }
            };
        }
        AbstractC28290Cdc.A01(AnonymousClass001.A0n("Size(", " x ", ") is out of range. Each dimension must be between 0 and 16777215.", i, i2));
        throw C00O.createAndThrow();
    }

    @Override // X.C6NO
    public final List Ep4(Object obj, InterfaceC16620sF interfaceC16620sF) {
        AnonymousClass599 anonymousClass599;
        String str;
        C6NM c6nm = this.A03;
        c6nm.A05();
        AnonymousClass599 anonymousClass5992 = c6nm.A09;
        Integer num = anonymousClass5992.A0U.A06;
        Integer num2 = C05F.A00;
        if (num != num2 && num != C05F.A0C && num != C05F.A01 && num != C05F.A0N) {
            str = "subcompose can only be used inside the measure or layout blocks";
        } else {
            HashMap hashMap = c6nm.A0C;
            Object obj2 = hashMap.get(obj);
            Object obj3 = obj2;
            if (obj2 == null) {
                AnonymousClass599 anonymousClass5993 = (AnonymousClass599) c6nm.A0B.remove(obj);
                if (anonymousClass5993 != null) {
                    int i = c6nm.A02;
                    if (i > 0) {
                        c6nm.A02 = i - 1;
                        anonymousClass599 = anonymousClass5993;
                    } else {
                        str = "Check failed.";
                    }
                } else {
                    AnonymousClass599 A00 = C6NM.A00(c6nm, obj);
                    anonymousClass599 = A00;
                    if (A00 == null) {
                        int i2 = c6nm.A00;
                        AnonymousClass599 anonymousClass5994 = new AnonymousClass599(true, AnonymousClass598.A00.addAndGet(1));
                        anonymousClass5992.A0J = true;
                        anonymousClass5992.A0V(anonymousClass5994, i2);
                        anonymousClass5992.A0J = false;
                        anonymousClass599 = anonymousClass5994;
                    }
                }
                hashMap.put(obj, anonymousClass599);
                obj3 = anonymousClass599;
            }
            AnonymousClass599 anonymousClass5995 = (AnonymousClass599) obj3;
            if (AbstractC001800i.A0O(anonymousClass5992.A0G(), c6nm.A00) != anonymousClass5995) {
                int indexOf = anonymousClass5992.A0G().indexOf(anonymousClass5995);
                int i3 = c6nm.A00;
                if (indexOf >= i3) {
                    if (i3 != indexOf) {
                        C6NM.A01(c6nm, indexOf, i3);
                    }
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append("Key \"");
                    sb.append(obj);
                    sb.append("\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
                    throw new IllegalArgumentException(sb.toString());
                }
            }
            c6nm.A00++;
            C6NM.A02(c6nm, anonymousClass5995, obj, interfaceC16620sF);
            if (num != num2 && num != C05F.A0C) {
                return anonymousClass5995.A0E();
            }
            return anonymousClass5995.A0U.A0J.A0L();
        }
        AbstractC28290Cdc.A01(str);
        throw C00O.createAndThrow();
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqH(float f) {
        return f / this.A00;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ float EqT(float f) {
        return f * this.A00;
    }

    @Override // X.InterfaceC1131259a
    public final AnonymousClass583 getLayoutDirection() {
        return this.A02;
    }

    @Override // X.InterfaceC1128957x
    public final /* synthetic */ long F7m(float f) {
        return F7l(EqH(f));
    }
}
