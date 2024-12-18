package X;

import android.graphics.Path;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.facebook.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.8NJ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8NJ {
    public float A00;
    public C206169Az A01;
    public C9TP A02;
    public Integer A03;
    public boolean A04;
    public boolean A05;
    public final Path A06;
    public final List A07;

    public C8NJ() {
        Path path = new Path();
        path.moveTo(0.05f, 0.05f);
        float f = 1.0f - 0.05f;
        float f2 = 0.5625f * f;
        path.lineTo(f2, 0.05f);
        path.lineTo(f2, f);
        path.lineTo(0.05f, f);
        path.lineTo(0.05f, 0.05f);
        this.A06 = path;
        this.A00 = 1.0f;
        this.A07 = new ArrayList();
        this.A01 = new C206169Az(0.0f, 0.0f, 15, 0.0f, 2, 0.0f);
        this.A04 = true;
        this.A05 = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v2, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r3v4, types: [android.view.View, java.lang.Object, android.view.ViewGroup] */
    public static final void A00(ViewGroup viewGroup, C81N c81n, C8NJ c8nj) {
        C9TP c9tp = c8nj.A02;
        if (c9tp != null) {
            c9tp.setBackground(null);
            if (c8nj.A05) {
                List list = c8nj.A07;
                list.clear();
                list.add(new C51u(c81n.A05(), Boolean.valueOf(c81n.A05().getClipToOutline()), false));
                c81n.A05().setClipToOutline(false);
                ?? A05 = c81n.A05();
                do {
                    ViewParent parent = A05.getParent();
                    if ((parent instanceof ViewGroup) && (A05 = (ViewGroup) parent) != 0) {
                        list.add(new C51u(A05, Boolean.valueOf(A05.getClipToOutline()), Boolean.valueOf(A05.getClipChildren())));
                        A05.setClipToOutline(false);
                        A05.setClipChildren(false);
                    } else {
                        return;
                    }
                } while (A05.getId() != R.id.quick_capture_outer_container);
                return;
            }
            C9TP c9tp2 = c8nj.A02;
            if (c9tp2 != null) {
                c9tp2.setVisibility(8);
                C9TP c9tp3 = c8nj.A02;
                if (c9tp3 != null) {
                    viewGroup.removeView(c9tp3);
                    return;
                }
            }
        }
        C14360o3.A0F("guideView");
        throw C00O.createAndThrow();
    }
}
