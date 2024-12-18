package X;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.litho.LithoView;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: X.2zu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C66772zu extends C1I2 {
    public static final java.util.Set A05 = AbstractC16830sb.A07(EnumC65592xv.A0m, EnumC65592xv.A0r, EnumC65592xv.A0g, EnumC65592xv.A0f, EnumC65592xv.A0h, EnumC65592xv.A0o, EnumC65592xv.A0p, EnumC65592xv.A0n, EnumC65592xv.A0k, EnumC65592xv.A0q, EnumC65592xv.A0c);
    public RecyclerView A00;
    public final AnonymousClass302 A01;
    public final AnonymousClass301 A02;
    public final boolean A03;
    public final InterfaceC66812zy A04 = new C66802zx(this);

    /* JADX WARN: Multi-variable type inference failed */
    public static final void A00(View view) {
        if (view instanceof InterfaceC51052Wb) {
            InterfaceC51052Wb interfaceC51052Wb = (InterfaceC51052Wb) view;
            interfaceC51052Wb.Dwi();
            interfaceC51052Wb.setRenderTreeUpdateListener(null);
        }
        if (view instanceof LithoView) {
            ((LithoView) view).A0l(null, true);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void A01(View view) {
        Long l;
        if (view instanceof InterfaceC51052Wb) {
            InterfaceC51052Wb interfaceC51052Wb = (InterfaceC51052Wb) view;
            RecyclerView recyclerView = this.A00;
            if (recyclerView != null) {
                l = Long.valueOf(recyclerView.getDrawingTime());
            } else {
                l = null;
            }
            interfaceC51052Wb.DeQ(l);
            interfaceC51052Wb.setRenderTreeUpdateListener(this.A04);
        }
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [X.2zz, java.lang.Object] */
    public C66772zu(C65502xm c65502xm, final InterfaceC66792zw interfaceC66792zw) {
        this.A03 = c65502xm.A0T;
        int intValue = ((Number) c65502xm.A06.getValue()).intValue();
        UserSession userSession = c65502xm.A02;
        C06090Tz c06090Tz = C06090Tz.A05;
        this.A02 = new AnonymousClass301(new C9B9(C18U.A06(c06090Tz, userSession, 36317204077024150L), intValue, (int) C18U.A01(c06090Tz, userSession, 36598679050128643L), (int) C18U.A01(c06090Tz, userSession, 36598679050194180L), 1), new Object(), new InterfaceC66792zw() { // from class: X.300
            @Override // X.InterfaceC66792zw
            public final int CgK() {
                return InterfaceC66792zw.this.CgK();
            }
        });
        this.A01 = new AnonymousClass302(this);
    }

    @Override // X.C1I2
    public final void onScroll(C3FQ c3fq, int i, int i2, int i3, int i4, int i5) {
        Integer valueOf;
        Integer valueOf2;
        int i6;
        int i7;
        int i8;
        int i9;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        int A03 = C0f9.A03(-652272682);
        AnonymousClass301 anonymousClass301 = this.A02;
        int i10 = (i2 + i) - 1;
        if (i != anonymousClass301.A00 || i10 != anonymousClass301.A01) {
            anonymousClass301.A00 = i;
            anonymousClass301.A01 = i10;
            int CgK = anonymousClass301.A09.CgK();
            if (anonymousClass301.A0C) {
                int i11 = CgK;
                TreeMap treeMap = anonymousClass301.A0B;
                Map.Entry floorEntry = treeMap.floorEntry(Integer.valueOf(i));
                int[] iArr4 = null;
                if (floorEntry != null) {
                    iArr4 = (int[]) floorEntry.getValue();
                }
                int i12 = 0;
                if (iArr4 != null) {
                    i6 = iArr4[0];
                } else {
                    i6 = 0;
                }
                Map.Entry floorEntry2 = treeMap.floorEntry(Integer.valueOf(i6 - 1));
                if (floorEntry2 != null && (iArr3 = (int[]) floorEntry2.getValue()) != null) {
                    i7 = iArr3[0];
                } else {
                    i7 = 0;
                }
                Map.Entry floorEntry3 = treeMap.floorEntry(Integer.valueOf(i10));
                if (floorEntry3 != null && (iArr2 = (int[]) floorEntry3.getValue()) != null) {
                    i8 = iArr2[0];
                    i9 = iArr2[1];
                } else {
                    i8 = 0;
                    i9 = 0;
                }
                Map.Entry ceilingEntry = treeMap.ceilingEntry(Integer.valueOf(i8 + i9));
                if (ceilingEntry != null && (iArr = (int[]) ceilingEntry.getValue()) != null) {
                    i11 = iArr[0];
                    i12 = iArr[1];
                }
                valueOf = Integer.valueOf(i7);
                valueOf2 = Integer.valueOf((i11 + i12) - 1);
            } else {
                int i13 = i - anonymousClass301.A07;
                int i14 = i10 + anonymousClass301.A08;
                valueOf = Integer.valueOf(i13);
                valueOf2 = Integer.valueOf(i14);
            }
            C09530e4 c09530e4 = new C09530e4(valueOf, valueOf2);
            int max = Math.max(0, ((Number) c09530e4.A00).intValue());
            int intValue = ((Number) c09530e4.A01).intValue();
            anonymousClass301.A05 = intValue;
            int min = Math.min(CgK - 1, intValue);
            int i15 = anonymousClass301.A03;
            if (max != i15 || min != anonymousClass301.A02) {
                int i16 = anonymousClass301.A02;
                anonymousClass301.A03 = max;
                anonymousClass301.A02 = min;
                int i17 = anonymousClass301.A06;
                if (min > i17) {
                    C17u c17u = new C17u(i15, i16);
                    C17u c17u2 = new C17u(max, min);
                    java.util.Set A0l = AbstractC001800i.A0l(c17u, c17u2);
                    java.util.Set A0j = AbstractC001800i.A0j(c17u);
                    AnonymousClass016.A16(c17u2, A0j);
                    List A0a = AbstractC001800i.A0a(AnonymousClass090.A02(A0l, A0j));
                    ArrayList arrayList = new ArrayList();
                    for (Object obj : A0a) {
                        int intValue2 = ((Number) obj).intValue();
                        if (intValue2 >= 0 && intValue2 < CgK) {
                            arrayList.add(obj);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        int intValue3 = ((Number) it.next()).intValue();
                        BD1 bd1 = (BD1) anonymousClass301.A0A.get(Integer.valueOf(intValue3));
                        if (bd1 != null) {
                            int i18 = anonymousClass301.A03;
                            if ((intValue3 <= anonymousClass301.A02 && i18 <= intValue3) || intValue3 < i17) {
                                bd1.E5U(C05F.A00);
                            } else {
                                bd1.clear();
                            }
                        }
                    }
                }
            }
        }
        C0f9.A0A(-508360949, A03);
    }

    @Override // X.C1I2
    public final void onScrollStateChanged(C3FQ c3fq, int i) {
        C0f9.A0A(-702106676, C0f9.A03(-1906978500));
    }
}
