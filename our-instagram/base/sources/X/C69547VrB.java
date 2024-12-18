package X;

import android.content.Context;
import com.facebook.R;
import com.facebook.common.dextricks.JITProfilePQR;
import com.facebook.forker.Process;
import com.instagram.react.modules.base.IgReactQEModule;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;

/* renamed from: X.VrB, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69547VrB {
    public final /* synthetic */ C161227Kh A00;
    public final /* synthetic */ EnumC46207Kcj A01;

    public final void A00(AbstractC56582ir abstractC56582ir) {
        Context context;
        int i;
        AbstractC56612iu abstractC56612iu;
        AbstractC56612iu[] abstractC56612iuArr;
        AbstractC56612iu abstractC56612iu2;
        AbstractC56612iu abstractC56612iu3;
        AbstractC56612iu[] abstractC56612iuArr2;
        AbstractC56612iu abstractC56612iu4;
        C14360o3.A0B(abstractC56582ir, 0);
        C161227Kh c161227Kh = this.A00;
        EnumC46207Kcj enumC46207Kcj = this.A01;
        switch (enumC46207Kcj.ordinal()) {
            case 9:
            case 11:
            case JITProfilePQR.HEADER_COMPRESSED_SIZE_OFFSET /* 13 */:
            case Process.SIGTERM /* 15 */:
                context = c161227Kh.A00;
                i = R.color.avatar_powerups_laugh_bubble_from;
                break;
            case 10:
            case IgReactQEModule.CONFIG_KEY_OFFSET /* 12 */:
            case 14:
            case 16:
                context = c161227Kh.A00;
                i = R.color.avatar_powerups_laugh_bubble_to;
                break;
        }
        int color = context.getColor(i);
        C56502ij c56502ij = new C56502ij((color >> 16) & 255, (color >> 8) & 255, color & 255, 255);
        AbstractC56612iu[] abstractC56612iuArr3 = abstractC56582ir.A04[abstractC56582ir.A00].A02.A0x;
        if (abstractC56612iuArr3 != null && (abstractC56612iu3 = abstractC56612iuArr3[0]) != null && (abstractC56612iuArr2 = abstractC56612iu3.A0x) != null && (abstractC56612iu4 = abstractC56612iuArr2[0]) != null) {
            abstractC56612iu4.A0S = c56502ij;
        }
        if (abstractC56612iuArr3 != null && (abstractC56612iu = abstractC56612iuArr3[1]) != null && (abstractC56612iuArr = abstractC56612iu.A0x) != null && (abstractC56612iu2 = abstractC56612iuArr[0]) != null) {
            abstractC56612iu2.A0S = c56502ij;
        }
        AbstractC25227BEk.A1O(abstractC56582ir, c161227Kh.A01, enumC46207Kcj.A00);
        CopyOnWriteArraySet copyOnWriteArraySet = c161227Kh.A02;
        ArrayList<C51757Mtg> arrayList = new ArrayList();
        Iterator it = copyOnWriteArraySet.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            C51757Mtg c51757Mtg = (C51757Mtg) next;
            C14360o3.A0A(c51757Mtg);
            if (C161227Kh.A01(c51757Mtg, c161227Kh)) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (C51757Mtg c51757Mtg2 : arrayList) {
            C14360o3.A0A(c51757Mtg2);
            C51756Mtf A00 = C161227Kh.A00(c51757Mtg2, c161227Kh);
            if (A00 != null) {
                AbstractC166997dE.A1R(c51757Mtg2, A00, arrayList2);
            }
        }
        Map A08 = AbstractC06930Yk.A08(arrayList2);
        copyOnWriteArraySet.removeAll(A08.keySet());
        Iterator A15 = AbstractC166997dE.A15(A08);
        while (A15.hasNext()) {
            Map.Entry entry = (Map.Entry) A15.next();
            ((InterfaceC16660sJ) ((C51757Mtg) entry.getKey()).A01).invoke(entry.getValue());
        }
    }

    public C69547VrB(C161227Kh c161227Kh, EnumC46207Kcj enumC46207Kcj) {
        this.A00 = c161227Kh;
        this.A01 = enumC46207Kcj;
    }
}
