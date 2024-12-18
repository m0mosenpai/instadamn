package X;

import com.facebook.proxygen.TraceFieldType;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;

/* loaded from: classes10.dex */
public final class R1Q extends C2JS implements C2JT {
    public final QW5 A0E() {
        return (QW5) getOptionalTreeField(4, DevServerEntity.COLUMN_DESCRIPTION, QW5.class, -1031131011);
    }

    public final QW9 A0F() {
        return (QW9) getOptionalTreeField(7, "terms", QW9.class, -1529202053);
    }

    @Override // X.C2JS
    public final C4OU modelSelectionSet() {
        C94754Oe c94754Oe = C94754Oe.A00;
        return AbstractC166987dD.A0k(new C4OM[]{AbstractC166987dD.A0i(c94754Oe, "screen_type"), AbstractC166987dD.A0i(c94754Oe, TraceFieldType.ContentType), AbstractC58318PtA.A0O(QWA.class, DialogModule.KEY_TITLE, 629783011), AbstractC58318PtA.A0O(QW8.class, "subtitle", -1766840138), AbstractC58318PtA.A0O(QW5.class, DevServerEntity.COLUMN_DESCRIPTION, -1031131011), AbstractC166987dD.A0h(C4OO.A02(), QW7.class, "error_messages", 1397580281), AbstractC58318PtA.A0O(QW6.class, "edit_text_field_title", 1525039633), AbstractC58318PtA.A0O(QW9.class, "terms", -1529202053)});
    }

    public R1Q(int i) {
        super(i);
    }

    public R1Q() {
        super(-523897260);
    }
}
