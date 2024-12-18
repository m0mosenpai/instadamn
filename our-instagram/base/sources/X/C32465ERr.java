package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.postcreation.IngestSessionShim;

/* renamed from: X.ERr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32465ERr extends AbstractC65632xz {
    public final Context A00;
    public final UserSession A01;
    public final IngestSessionShim A02;
    public final C54410O2q A03;
    public final InterfaceC58149PqE A04;
    public final InterfaceC58010Pnu A05;

    public C32465ERr(Context context, UserSession userSession, IngestSessionShim ingestSessionShim, C54410O2q c54410O2q, InterfaceC58149PqE interfaceC58149PqE, InterfaceC58010Pnu interfaceC58010Pnu) {
        AbstractC167027dH.A0a(1, context, userSession, interfaceC58010Pnu, interfaceC58149PqE);
        C14360o3.A0B(c54410O2q, 5);
        this.A00 = context;
        this.A01 = userSession;
        this.A05 = interfaceC58010Pnu;
        this.A04 = interfaceC58149PqE;
        this.A03 = c54410O2q;
        this.A02 = ingestSessionShim;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x00c2, code lost:
    
        if (r2 == r1) goto L16;
     */
    @Override // X.InterfaceC65642y0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void bindView(int r24, android.view.View r25, java.lang.Object r26, java.lang.Object r27) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C32465ERr.bindView(int, android.view.View, java.lang.Object, java.lang.Object):void");
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        Drawable drawable;
        int A03 = C0f9.A03(-129432893);
        C14360o3.A0B(viewGroup, 1);
        UserSession userSession = this.A01;
        C14360o3.A0B(userSession, 1);
        Context context = viewGroup.getContext();
        View A0C = AbstractC31173DnH.A0C(LayoutInflater.from(context), viewGroup, R.layout.recipient_picker_add_to_exclusive_story, false);
        FNW fnw = new FNW(A0C, userSession);
        TextView textView = fnw.A03;
        C14360o3.A0A(context);
        textView.setTypeface(AbstractC167017dG.A0R(context));
        ImageView imageView = fnw.A02;
        C14360o3.A0B(context, 0);
        Drawable drawable2 = context.getDrawable(R.drawable.exclusive_story_recipient_picker);
        if (drawable2 != null) {
            drawable = drawable2.mutate();
        } else {
            drawable = null;
        }
        imageView.setImageDrawable(drawable);
        A0C.setTag(fnw);
        C0f9.A0A(-941359394, A03);
        return A0C;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        AbstractC31176DnK.A1T(anonymousClass306);
    }
}
