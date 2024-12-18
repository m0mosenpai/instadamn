package X;

import android.graphics.Paint;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import androidx.fragment.app.Fragment;

/* loaded from: classes8.dex */
public final class LIN {
    public static final LIN A00 = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002d, code lost:
    
        if (r17 != false) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.instagram.direct.inbox.notes.models.NoteAudienceItem A01(android.content.Context r10, android.view.View r11, com.instagram.common.session.UserSession r12, com.instagram.direct.inbox.notes.models.NoteAudienceItem r13, boolean r14, boolean r15, boolean r16, boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LIN.A01(android.content.Context, android.view.View, com.instagram.common.session.UserSession, com.instagram.direct.inbox.notes.models.NoteAudienceItem, boolean, boolean, boolean, boolean, boolean):com.instagram.direct.inbox.notes.models.NoteAudienceItem");
    }

    public static final ShapeDrawable A00(Fragment fragment) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        Paint paint = shapeDrawable.getPaint();
        AbstractC166987dD.A1N(fragment.requireContext(), paint, AbstractC53242c7.A08(fragment.requireContext()));
        AbstractC43592JPx.A1E(paint);
        paint.setStrokeWidth(AbstractC13880nE.A00(fragment.requireContext(), 1.0f));
        paint.setAntiAlias(true);
        return shapeDrawable;
    }
}
