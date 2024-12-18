package X;

import android.content.Context;
import android.graphics.Canvas;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.memories.model.MemoryItem;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: X.8xl, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C202678xl extends C5RN implements InterfaceC25178BCb {
    public final C216169hZ A00;
    public final User A01;
    public final int A02;
    public final C217639jw A03;
    public final List A04;

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        return 1;
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A04;
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        return Collections.singletonList(this.A01);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        this.A03.draw(canvas);
        this.A00.draw(canvas);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A03.getIntrinsicHeight() + this.A02 + this.A00.A00;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.A00.getIntrinsicWidth();
    }

    public C202678xl(Context context, UserSession userSession, MemoryItem memoryItem) {
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height);
        User user = memoryItem.A01.A02;
        user.getClass();
        this.A01 = user;
        C216169hZ c216169hZ = new C216169hZ(context, userSession, user);
        this.A00 = c216169hZ;
        C217639jw c217639jw = new C217639jw(context, userSession, memoryItem, c216169hZ.getIntrinsicWidth());
        this.A03 = c217639jw;
        Collections.addAll(arrayList, c217639jw, c216169hZ);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        C217639jw c217639jw = this.A03;
        int intrinsicWidth = c217639jw.getIntrinsicWidth() / 2;
        c217639jw.setBounds(i5 - intrinsicWidth, i2, intrinsicWidth + i5, c217639jw.getIntrinsicHeight() + i2);
        C216169hZ c216169hZ = this.A00;
        int intrinsicWidth2 = c216169hZ.getIntrinsicWidth() / 2;
        int intrinsicHeight = c217639jw.getIntrinsicHeight() + i2 + this.A02;
        c216169hZ.setBounds(i5 - intrinsicWidth2, intrinsicHeight, i5 + intrinsicWidth2, c216169hZ.A00 + intrinsicHeight);
    }
}
