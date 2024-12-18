package X;

import android.content.Context;
import com.instagram.music.common.model.MusicOverlayStickerModel;
import java.util.Collections;

/* renamed from: X.Fcv, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC35084Fcv {
    public static void A01(Context context, MusicOverlayStickerModel musicOverlayStickerModel, GZN gzn, boolean z) {
        int i;
        if (!z && AbstractC101614hW.A0D(musicOverlayStickerModel)) {
            gzn.DlA(Collections.singletonList(AbstractC166997dE.A0b()));
            return;
        }
        DialogInterfaceOnClickListenerC35454FkB A00 = DialogInterfaceOnClickListenerC35454FkB.A00(gzn, 58);
        DialogInterfaceOnClickListenerC35454FkB A002 = DialogInterfaceOnClickListenerC35454FkB.A00(gzn, 59);
        C193328hC A0I = AbstractC31171DnF.A0I(context);
        if (musicOverlayStickerModel != null && AbstractC166997dE.A1Z(musicOverlayStickerModel.A0E, true)) {
            A0I.A0A(2131972789);
            i = 2131972788;
        } else {
            A0I.A0A(2131972787);
            i = 2131972786;
        }
        A0I.A09(i);
        A0I.A0J(A00, 2131972709);
        A0I.A0D(A002);
        A0I.A0t(true);
        DialogInterfaceOnCancelListenerC35300FhZ.A00(A0I, A002, 6);
        AbstractC166987dD.A1W(A0I);
    }

    public static void A00(Context context, C41181vS c41181vS, GZN gzn) {
        MusicOverlayStickerModel A04 = AbstractC101614hW.A04(c41181vS);
        if (!AbstractC101614hW.A0D(A04)) {
            Boolean bool = Boolean.TRUE;
            A04.getClass();
            F9E.A00(context, DialogInterfaceOnClickListenerC35454FkB.A00(gzn, 60), bool.equals(A04.A0E));
            return;
        }
        gzn.DlA(Collections.singletonList(AbstractC166997dE.A0b()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0028, code lost:
    
        if (r3 == false) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void A02(android.content.Context r9, X.GZN r10, java.util.List r11) {
        /*
            java.util.ArrayList r5 = X.AbstractC166987dD.A1E()
            java.lang.Boolean r8 = X.AbstractC166997dE.A0b()
            java.util.Iterator r7 = r11.iterator()
            r6 = r8
        Ld:
            boolean r0 = r7.hasNext()
            if (r0 == 0) goto L4e
            X.1qM r1 = X.AbstractC31172DnG.A0i(r7)
            r0 = 0
            com.instagram.music.common.model.MusicOverlayStickerModel r4 = X.AbstractC101614hW.A03(r0, r1, r0)
            boolean r3 = X.AbstractC101614hW.A0D(r4)
            boolean r0 = r8.booleanValue()
            r2 = 0
            if (r0 == 0) goto L2a
            r0 = 1
            if (r3 != 0) goto L2b
        L2a:
            r0 = 0
        L2b:
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r0)
            if (r4 == 0) goto L46
            boolean r0 = r6.booleanValue()
            if (r0 == 0) goto L42
            java.lang.Boolean r1 = java.lang.Boolean.TRUE
            java.lang.Boolean r0 = r4.A0E
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L42
            r2 = 1
        L42:
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r2)
        L46:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r3)
            r5.add(r0)
            goto Ld
        L4e:
            boolean r0 = r8.booleanValue()
            if (r0 != 0) goto L62
            boolean r1 = r6.booleanValue()
            r0 = 53
            X.FkC r0 = X.DialogInterfaceOnClickListenerC35455FkC.A00(r10, r5, r0)
            X.F9E.A00(r9, r0, r1)
            return
        L62:
            r10.DlA(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AbstractC35084Fcv.A02(android.content.Context, X.GZN, java.util.List):void");
    }
}
