package X;

import android.view.View;
import android.view.ViewStub;
import com.facebook.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;

/* renamed from: X.6SB, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6SB {
    public IgTextView A00;
    public IgTextView A01;
    public IgTextView A02;
    public CircularImageView A03;
    public final InterfaceC56392iX A04;

    public C6SB(ViewStub viewStub) {
        C14360o3.A0B(viewStub, 1);
        InterfaceC56392iX A01 = AbstractC56372iV.A01(viewStub, false, false);
        this.A04 = A01;
        A01.EZv(new InterfaceC69513Al() { // from class: X.6SC
            @Override // X.InterfaceC69513Al
            public final void DLu(View view) {
                C14360o3.A0B(view, 0);
                C6SB c6sb = C6SB.this;
                c6sb.A02 = (IgTextView) view.requireViewById(R.id.title_text);
                c6sb.A01 = (IgTextView) view.requireViewById(R.id.subtitle_text);
                c6sb.A00 = (IgTextView) view.requireViewById(R.id.create_story_button);
                c6sb.A03 = (CircularImageView) view.requireViewById(R.id.avatar_image_view);
            }
        });
    }
}
