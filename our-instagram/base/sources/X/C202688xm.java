package X;

import android.content.Context;
import android.graphics.Canvas;
import android.text.Layout;
import android.text.Spannable;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.8xm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public class C202688xm extends C5RN implements InterfaceC25178BCb {
    public final C6RB A00;
    public final C6RB A01;
    public final int A02;
    public final UserSession A03;
    public final List A04;

    public C202688xm(Context context, UserSession userSession, CharSequence charSequence, CharSequence charSequence2, int i, int i2, int i3, int i4) {
        C14360o3.A0B(userSession, 1);
        C14360o3.A0B(context, 2);
        C14360o3.A0B(charSequence, 3);
        C14360o3.A0B(charSequence2, 4);
        this.A03 = userSession;
        this.A02 = i3;
        C6RB c6rb = new C6RB(context, i);
        this.A01 = c6rb;
        ArrayList arrayList = new ArrayList();
        this.A04 = arrayList;
        Layout.Alignment alignment = Layout.Alignment.ALIGN_CENTER;
        c6rb.A0K(alignment);
        c6rb.A0A(i2);
        c6rb.A0F(-1);
        C6RB c6rb2 = new C6RB(context, i);
        this.A00 = c6rb2;
        c6rb2.A0K(alignment);
        c6rb2.A0A(i4);
        c6rb2.A0F(-1);
        this.A01.A0M(charSequence);
        this.A00.A0M(charSequence2);
        Collections.addAll(arrayList, c6rb, c6rb2);
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        C14360o3.A0B(canvas, 0);
        this.A01.draw(canvas);
        this.A00.draw(canvas);
    }

    @Override // X.C5RN
    public final List A07() {
        return this.A04;
    }

    @Override // X.InterfaceC25178BCb
    public final int BSK() {
        ArrayList arrayList = new ArrayList();
        Spannable spannable = this.A00.A0F;
        C14360o3.A07(spannable);
        AbstractC202868y4[] abstractC202868y4Arr = (AbstractC202868y4[]) C4GL.A06(spannable, AbstractC202868y4.class);
        for (AbstractC202868y4 abstractC202868y4 : abstractC202868y4Arr) {
            arrayList.add(abstractC202868y4);
        }
        return arrayList.size();
    }

    @Override // X.InterfaceC25178BCb
    public final List BSS() {
        ArrayList arrayList = new ArrayList();
        C6RB c6rb = this.A00;
        Spannable spannable = c6rb.A0F;
        C14360o3.A07(spannable);
        int length = ((AbstractC202868y4[]) C4GL.A06(spannable, AbstractC202868y4.class)).length;
        for (int i = 0; i < length; i++) {
            arrayList.add(c6rb.A0F.toString());
        }
        C18A A00 = AnonymousClass189.A00(this.A03);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object obj = A00.A02.get(it.next());
            if (obj != null) {
                arrayList2.add(obj);
            }
        }
        return arrayList2;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.A01.A06 + this.A02 + this.A00.A06;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return Math.max(this.A01.A0A, this.A00.A0A);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        int i5 = (i + i3) / 2;
        C6RB c6rb = this.A01;
        int i6 = c6rb.A0A / 2;
        c6rb.setBounds(i5 - i6, i2, i6 + i5, c6rb.A06 + i2);
        C6RB c6rb2 = this.A00;
        int i7 = c6rb2.A0A / 2;
        int i8 = c6rb.A06 + i2 + this.A02;
        c6rb2.setBounds(i5 - i7, i8, i5 + i7, c6rb2.A06 + i8);
    }
}
