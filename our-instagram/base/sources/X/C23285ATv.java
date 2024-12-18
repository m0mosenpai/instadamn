package X;

import android.widget.CompoundButton;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.ATv, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C23285ATv implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ IgTextView A00;
    public final /* synthetic */ IgTextView A01;
    public final /* synthetic */ C187318Ry A02;

    public C23285ATv(IgTextView igTextView, IgTextView igTextView2, C187318Ry c187318Ry) {
        this.A00 = igTextView;
        this.A01 = igTextView2;
        this.A02 = c187318Ry;
    }

    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        C187318Ry c187318Ry;
        Integer num;
        if (z) {
            this.A00.setActivated(true);
            this.A01.setActivated(false);
            c187318Ry = this.A02;
            num = C05F.A01;
        } else {
            this.A01.setActivated(true);
            this.A00.setActivated(false);
            c187318Ry = this.A02;
            num = C05F.A00;
        }
        c187318Ry.A0A = num;
        c187318Ry.A0T.D54(num);
    }
}
