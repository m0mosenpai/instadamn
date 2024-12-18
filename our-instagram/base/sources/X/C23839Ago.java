package X;

import android.app.Activity;
import android.app.Dialog;
import java.util.Collections;
import java.util.List;

/* renamed from: X.Ago, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23839Ago implements InterfaceC25181BCe {
    public final /* synthetic */ C8LZ A00;
    public final /* synthetic */ C183978Ee A01;

    public C23839Ago(C8LZ c8lz, C183978Ee c183978Ee) {
        this.A00 = c8lz;
        this.A01 = c183978Ee;
    }

    @Override // X.InterfaceC25181BCe
    public final void DfJ(boolean z, String str) {
        C9PL c9pl = new C9PL(str);
        C183978Ee c183978Ee = this.A01;
        List singletonList = Collections.singletonList(c183978Ee.A05());
        C14360o3.A0B(singletonList, 0);
        c9pl.A0A = singletonList;
        c9pl.A04 = c183978Ee.A0T;
        c9pl.A01 = c183978Ee.A0O;
        c9pl.A05 = c183978Ee.A0W;
        c9pl.A02 = c183978Ee.A0P;
        c9pl.A03 = c183978Ee.A0Q;
        c9pl.A07 = c183978Ee.A0c;
        c9pl.A06 = c183978Ee.A0b;
        c9pl.A00 = c183978Ee.A0K;
        c9pl.A0B = true;
        AbstractC188508Wp.A04(this.A00.A0D, c9pl);
    }

    @Override // X.InterfaceC25181BCe
    public final void DiH(boolean z, String str) {
        String str2;
        C8LZ c8lz = this.A00;
        C006802i c006802i = C006802i.A0p;
        short s = 3;
        if (z) {
            s = 2;
        }
        c006802i.markerEnd(18948745, s);
        ((Dialog) c8lz.A0l.getValue()).dismiss();
        int i = 2131961880;
        if (z) {
            i = 2131969594;
        }
        Activity activity = c8lz.A0A;
        if (z) {
            str2 = null;
        } else {
            str2 = "save_to_gallery_failed";
        }
        C9GR.A0F(activity, str2, i);
    }
}
