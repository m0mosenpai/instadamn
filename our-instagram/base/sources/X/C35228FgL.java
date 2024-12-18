package X;

import android.content.Context;
import com.instagram.igds.components.bulletcell.IgdsBulletCell;
import com.instagram.igds.components.headline.IgdsHeadline;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.FgL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35228FgL {
    public final Context A00;
    public final Boolean A01;
    public final Boolean A02;
    public final List A03;

    public C35228FgL(Context context, Boolean bool, Boolean bool2) {
        C14360o3.A0B(context, 1);
        this.A00 = context;
        this.A01 = bool;
        this.A02 = bool2;
        this.A03 = AbstractC166987dD.A1E();
    }

    public static C35228FgL A00(Context context, Boolean bool) {
        return new C35228FgL(context, bool, 4);
    }

    public final List A03() {
        EnumC33418Epp enumC33418Epp;
        List<C34610FMt> list = this.A03;
        ArrayList A0q = AbstractC167017dG.A0q(list);
        for (C34610FMt c34610FMt : list) {
            Context context = this.A00;
            C14360o3.A0B(c34610FMt, 1);
            IgdsBulletCell igdsBulletCell = new IgdsBulletCell(context, null, 0);
            igdsBulletCell.setIcon(c34610FMt.A00);
            IgdsBulletCell.A00(igdsBulletCell, c34610FMt.A04, c34610FMt.A03);
            igdsBulletCell.setExcludeHorizontalPadding(C14360o3.A0K(c34610FMt.A01, true));
            if (C14360o3.A0K(c34610FMt.A02, true)) {
                enumC33418Epp = EnumC33418Epp.A06;
            } else {
                enumC33418Epp = EnumC33418Epp.A05;
            }
            igdsBulletCell.setSurfaceType(enumC33418Epp);
            A0q.add(igdsBulletCell);
        }
        return A0q;
    }

    public final void A04(CharSequence charSequence, CharSequence charSequence2, int i) {
        this.A03.add(new C34610FMt(this.A01, this.A02, charSequence, charSequence2, i));
    }

    public static C35228FgL A01(Context context, boolean z) {
        return new C35228FgL(context, Boolean.valueOf(z), 4);
    }

    public static void A02(C35228FgL c35228FgL, IgdsHeadline igdsHeadline, CharSequence charSequence, CharSequence charSequence2, int i) {
        c35228FgL.A04(charSequence, charSequence2, i);
        igdsHeadline.setBulletList(c35228FgL.A03());
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ C35228FgL(android.content.Context r4, java.lang.Boolean r5, int r6) {
        /*
            r3 = this;
            r2 = 0
            r0 = r6 & 2
            java.lang.Boolean r1 = X.AbstractC166997dE.A0a()
            if (r0 == 0) goto La
            r5 = r1
        La:
            r0 = r6 & 4
            if (r0 == 0) goto Lf
            r2 = r1
        Lf:
            r3.<init>(r4, r5, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C35228FgL.<init>(android.content.Context, java.lang.Boolean, int):void");
    }
}
