package X;

import android.widget.RadioGroup;
import java.util.List;

/* renamed from: X.Fqh, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C35749Fqh implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C33206Ekt A01;
    public final /* synthetic */ List A02;

    public C35749Fqh(C33206Ekt c33206Ekt, List list, long j) {
        this.A02 = list;
        this.A01 = c33206Ekt;
        this.A00 = j;
    }

    @Override // android.widget.RadioGroup.OnCheckedChangeListener
    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        String str = ((C35124FeR) this.A02.get(i)).A02;
        if (!C14360o3.A0K(str, "off")) {
            C14360o3.A0A(str);
            j = Integer.parseInt(str);
        } else {
            j = 0;
        }
        this.A01.A00 = j * this.A00;
    }
}
