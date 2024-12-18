package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.instagram.common.gallery.Medium;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.User;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.9Bb, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C206189Bb extends C0T6 {
    public Object A00;
    public boolean A01;
    public final int A02;
    public final Object A03;

    public static boolean A00(Object obj, int i) {
        if ((obj instanceof C206189Bb) && ((C206189Bb) obj).A02 == i) {
            return true;
        }
        return false;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:2:0x0002. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:12:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:80:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r3) {
        /*
            Method dump skipped, instructions count: 296
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206189Bb.equals(java.lang.Object):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:5:0x0011  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int hashCode() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C206189Bb.hashCode():int");
    }

    public final String toString() {
        if (2 - this.A02 != 0) {
            return super.toString();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("ClipsTimelineEditorUiState(currTimelineState=");
        sb.append(this.A00);
        sb.append(", prevTimelineState=");
        sb.append(this.A03);
        sb.append(MSV.A00(67));
        sb.append(this.A01);
        sb.append(')');
        return sb.toString();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C206189Bb() {
        this((AbstractC187378Sf) new C187368Se(false), (AbstractC187378Sf) new C187368Se(false), false);
        this.A02 = 2;
    }

    public C206189Bb(C37771pE c37771pE, List list, boolean z) {
        this.A02 = 8;
        C14360o3.A0B(list, 1);
        this.A00 = list;
        this.A03 = c37771pE;
        this.A01 = z;
    }

    public C206189Bb(C38321qM c38321qM, Integer num, boolean z) {
        this.A02 = 4;
        this.A03 = c38321qM;
        this.A01 = z;
        this.A00 = num;
    }

    public C206189Bb(AbstractC187378Sf abstractC187378Sf, AbstractC187378Sf abstractC187378Sf2, boolean z) {
        this.A02 = 2;
        this.A00 = abstractC187378Sf;
        this.A03 = abstractC187378Sf2;
        this.A01 = z;
    }

    public C206189Bb(C9BW c9bw, C3t9 c3t9, boolean z) {
        this.A02 = 7;
        this.A01 = z;
        this.A03 = c3t9;
        this.A00 = c9bw;
    }

    public C206189Bb(C9BW c9bw, CharSequence charSequence, boolean z) {
        this.A02 = 6;
        C14360o3.A0B(charSequence, 1);
        this.A03 = charSequence;
        this.A01 = z;
        this.A00 = c9bw;
    }

    public C206189Bb(Drawable drawable) {
        this.A02 = 1;
        Integer num = C05F.A01;
        this.A02 = 1;
        this.A03 = drawable;
        this.A00 = num;
        this.A01 = true;
    }

    public C206189Bb(View view, EnumC77673dr enumC77673dr, boolean z) {
        this.A02 = 9;
        this.A00 = view;
        this.A03 = enumC77673dr;
        this.A01 = z;
    }

    public C206189Bb(Medium medium, Integer num, boolean z) {
        this.A02 = 3;
        C14360o3.A0B(medium, 1);
        C14360o3.A0B(num, 2);
        this.A03 = medium;
        this.A00 = num;
        this.A01 = z;
    }

    public C206189Bb(ImageUrl imageUrl, WeakReference weakReference, boolean z) {
        this.A02 = 0;
        this.A03 = imageUrl;
        this.A00 = weakReference;
        this.A01 = z;
    }

    public C206189Bb(User user, Integer num, boolean z) {
        this.A02 = 5;
        this.A00 = num;
        this.A01 = z;
        this.A03 = user;
    }
}
