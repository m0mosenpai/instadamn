package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.zip.CRC32;

/* renamed from: X.4rr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C106904rr implements TextWatcher {
    public static final C106914rs A05 = new C106914rs();
    public final C106934ru A00;
    public final InterfaceC11360iu A01;
    public final C106954rw A02;
    public final C106914rs A03;
    public final String A04;

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public static C106904rr A00(final AbstractC12990ll abstractC12990ll) {
        return (C106904rr) abstractC12990ll.A01(C106904rr.class, new InterfaceC16820sZ() { // from class: X.4rt
            /* JADX WARN: Type inference failed for: r2v0, types: [X.4rw] */
            @Override // X.InterfaceC16820sZ
            public final Object invoke() {
                AbstractC12990ll abstractC12990ll2 = AbstractC12990ll.this;
                C106914rs c106914rs = C106904rr.A05;
                AbstractC19330xH A00 = AbstractC11060iN.A00(abstractC12990ll2);
                C106934ru c106934ru = new C106934ru();
                C106914rs c106914rs2 = C106904rr.A05;
                ?? r2 = new Object() { // from class: X.4rw
                };
                String A02 = AbstractC03270Dk.A02(abstractC12990ll2);
                if (A02 == null) {
                    A02 = "0";
                }
                return new C106904rr(r2, c106934ru, c106914rs2, A00, A02);
            }
        });
    }

    public static void A01(C106904rr c106904rr, Integer num, long j) {
        C19280xC A00;
        if (num == C05F.A00) {
            c106904rr.A00.A03 = j;
        } else if (num == C05F.A01) {
            C106934ru c106934ru = c106904rr.A00;
            String str = c106904rr.A04;
            long j2 = j / 1000;
            long j3 = c106934ru.A00;
            if (j2 > j3) {
                long j4 = j3 * 1000;
                c106934ru.A00 = j2;
                C106944rv c106944rv = c106934ru.A01;
                C106964rx c106964rx = c106944rv.A00;
                if (c106964rx == null) {
                    CRC32 crc32 = new CRC32();
                    crc32.update(str.getBytes());
                    c106964rx = new C106964rx(crc32.getValue() % 2003);
                    c106944rv.A00 = c106964rx;
                }
                long j5 = c106964rx.A00;
                if (j5 != -1 && j5 == j2 % 2003) {
                    C19280xC A01 = C19280xC.A01("immediate_active_seconds", C26771Rh.A00().A00);
                    A01.A0B("activity_time", Long.valueOf(j));
                    A01.A0B("last_activity_time", Long.valueOf(j4));
                    A01.A0B("last_foreground_time", Long.valueOf(c106934ru.A03));
                    c106904rr.A01.EIu(A01);
                }
            }
        }
        C106914rs c106914rs = c106904rr.A03;
        InterfaceC11360iu interfaceC11360iu = c106904rr.A01;
        int intValue = num.intValue();
        if (intValue != 1) {
            if ((intValue != 3 && intValue != 2 && intValue != 0 && intValue != 5) || c106914rs.A05 == null) {
                return;
            }
            A00 = C106914rs.A00(c106914rs, num, j / 1000);
            c106914rs.A05 = null;
            c106914rs.A04 = 0L;
        } else {
            long j6 = j / 1000;
            if (j6 <= c106914rs.A04) {
                return;
            }
            long j7 = j6 - c106914rs.A03;
            if (j7 >= 0 && j7 < 64) {
                A00 = null;
            } else {
                A00 = C106914rs.A00(c106914rs, C05F.A01, j6);
                c106914rs.A05 = null;
                c106914rs.A04 = 0L;
            }
            int[] iArr = c106914rs.A05;
            if (iArr == null) {
                c106914rs.A04 = j6;
                c106914rs.A03 = j6;
                int i = c106914rs.A00;
                int[] iArr2 = new int[i];
                c106914rs.A05 = iArr2;
                iArr2[0] = 1;
                for (int i2 = 1; i2 < i; i2++) {
                    iArr2[i2] = 0;
                }
                c106914rs.A02++;
            } else {
                int i3 = (int) j7;
                int i4 = i3 >> 5;
                iArr[i4] = (1 << (i3 & 31)) | iArr[i4];
                c106914rs.A04 = j6;
            }
            c106914rs.A01++;
        }
        if (A00 == null) {
            return;
        }
        interfaceC11360iu.EHW(A00);
    }

    public static void A02(InterfaceC11360iu interfaceC11360iu, String str) {
        String str2;
        InterfaceC19630xq interfaceC19630xq = AbstractC19730y1.A00(AbstractC12960li.A00).A00;
        boolean z = interfaceC19630xq.getBoolean("launcher_badge_supported", false);
        int i = interfaceC19630xq.getInt("optimistic_launcher_badge_count_direct", 0);
        int i2 = interfaceC19630xq.getInt("optimistic_launcher_badge_count_unseen_activities", 0);
        C19280xC A01 = C19280xC.A01(AbstractC43591JPw.A00(295), C26771Rh.A00().A00);
        A01.A0C(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str);
        A01.A08(Integer.valueOf(i + i2), "total_badge_count");
        A01.A08(Integer.valueOf(i), "direct_badge_total_count");
        A01.A08(Integer.valueOf(i2), "af_badge_total_count");
        if (z) {
            str2 = "numbered";
        } else {
            str2 = "dot_badge";
        }
        A01.A0C("display_type", str2);
        A01.A0C("nav_chain", C1QM.A00.A02.A00);
        interfaceC11360iu.EHW(A01);
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        A01(this, C05F.A01, System.currentTimeMillis());
    }

    public C106904rr(C106954rw c106954rw, C106934ru c106934ru, C106914rs c106914rs, InterfaceC11360iu interfaceC11360iu, String str) {
        this.A01 = interfaceC11360iu;
        this.A00 = c106934ru;
        this.A03 = c106914rs;
        this.A02 = c106954rw;
        this.A04 = str;
    }
}
