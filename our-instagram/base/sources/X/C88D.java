package X;

import android.view.View;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.88D, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C88D extends C88E {
    public final AnonymousClass891 A00;

    public C88D(View view, InterfaceC11380iw interfaceC11380iw, C3I9 c3i9, TargetViewSizeProvider targetViewSizeProvider, C81J c81j, AnonymousClass880 anonymousClass880, InterfaceC1810081c interfaceC1810081c, AnonymousClass844 anonymousClass844) {
        super(view, interfaceC11380iw, c3i9, targetViewSizeProvider, c81j, anonymousClass880, interfaceC1810081c, anonymousClass844);
        this.A00 = new AnonymousClass891(this.A06, this.A09, super.A00, this.A0C, new AnonymousClass890() { // from class: X.88z
            @Override // X.AnonymousClass890
            public final void DA6(List list) {
                ArrayList arrayList = new ArrayList(list);
                C88D c88d = C88D.this;
                if (c88d.A09() && !c88d.A0A()) {
                    return;
                }
                C88X c88x = ((C88E) c88d).A00;
                if (c88x != null) {
                    C88Z c88z = c88x.A04;
                    if (c88z == null) {
                        c88z = C88Z.A0G;
                    }
                    if (c88z == C88Z.A0I || c88z == C88Z.A09 || c88z == C88Z.A0d) {
                        arrayList.add(0, c88x);
                    }
                }
                c88d.A0H.A06(arrayList);
                c88d.A0J.A00().FAh();
                c88d.A03();
            }
        }, false);
    }
}
