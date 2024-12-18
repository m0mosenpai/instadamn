package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.2yO, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C65862yO extends AbstractC65632xz {
    public C693439u A00;
    public C685736u A01;
    public final C65102x8 A02;
    public final Context A03;
    public final Fragment A04;
    public final InterfaceC11380iw A05;
    public final UserSession A06;

    public C65862yO(Context context, Fragment fragment, InterfaceC11380iw interfaceC11380iw, UserSession userSession, C65102x8 c65102x8) {
        C14360o3.A0B(context, 2);
        C14360o3.A0B(fragment, 3);
        C14360o3.A0B(c65102x8, 5);
        this.A06 = userSession;
        this.A03 = context;
        this.A04 = fragment;
        this.A05 = interfaceC11380iw;
        this.A02 = c65102x8;
    }

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        C42521Is0 c42521Is0 = (C42521Is0) obj;
        C42662IuJ c42662IuJ = (C42662IuJ) obj2;
        C14360o3.A0B(anonymousClass306, 0);
        C14360o3.A0B(c42521Is0, 1);
        C14360o3.A0B(c42662IuJ, 2);
        if (c42662IuJ.Ceb()) {
            anonymousClass306.A7a(1);
        } else {
            anonymousClass306.A7a(0);
            this.A02.A9W(c42521Is0, c42662IuJ);
        }
    }

    @Override // X.InterfaceC65642y0
    public final void bindView(int i, View view, Object obj, Object obj2) {
        boolean z;
        int A03 = C0f9.A03(-1066118191);
        C14360o3.A0B(view, 1);
        C14360o3.A0B(obj, 2);
        C14360o3.A0B(obj2, 3);
        if (i == 0) {
            C42521Is0 c42521Is0 = (C42521Is0) obj;
            this.A02.EDV(view, (InterfaceC73233Pz) obj);
            UserSession userSession = this.A06;
            Object tag = view.getTag();
            C14360o3.A0C(tag, "null cannot be cast to non-null type com.instagram.feed.notes.NotesNetegoViewBinder.Holder");
            C4FV c4fv = (C4FV) tag;
            C42662IuJ c42662IuJ = (C42662IuJ) obj2;
            C685736u c685736u = this.A01;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(c4fv, 3);
            C14360o3.A0B(c42521Is0, 4);
            C14360o3.A0B(c42662IuJ, 5);
            C38640Gyh c38640Gyh = c42521Is0.A00;
            C9C4 c9c4 = c38640Gyh.A00;
            if (c9c4 != null) {
                C4AC.A00.A0H(userSession);
                List list = (List) c9c4.A01;
                ArrayList arrayList = new ArrayList(AbstractC06950Ym.A1E(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((C6C9) it.next()).A0H);
                }
                C92854Eb c92854Eb = c4fv.A02;
                Boolean bool = c38640Gyh.A02;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                c92854Eb.A01 = arrayList;
                c92854Eb.A02 = z;
                C92854Eb.A01(c92854Eb);
                if (c685736u != null) {
                    Boolean bool2 = c38640Gyh.A03;
                    if (bool2 != null && bool2.booleanValue()) {
                        TextView textView = c4fv.A01;
                        textView.setVisibility(0);
                        C0fQ.A00(new ViewOnClickListenerC23227ARl(userSession, c685736u), textView);
                    }
                    ImageView imageView = c4fv.A00;
                    imageView.setVisibility(0);
                    C0fQ.A00(new ViewOnClickListenerC41928IiL(c42521Is0, c42662IuJ, c685736u), imageView);
                }
            }
        } else {
            C693439u c693439u = this.A00;
            if (c693439u != null) {
                c693439u.A01(view, this.A06, (C42521Is0) obj, obj2);
            }
        }
        C0f9.A0A(-243947094, A03);
    }

    @Override // X.InterfaceC65642y0
    public final View createView(int i, ViewGroup viewGroup) {
        View A00;
        int A03 = C0f9.A03(-640171424);
        C14360o3.A0B(viewGroup, 1);
        if (i == 0) {
            UserSession userSession = this.A06;
            Fragment fragment = this.A04;
            InterfaceC11380iw interfaceC11380iw = this.A05;
            Context context = this.A03;
            C14360o3.A0B(userSession, 0);
            C14360o3.A0B(fragment, 1);
            C14360o3.A0B(interfaceC11380iw, 2);
            C14360o3.A0B(context, 3);
            A00 = LayoutInflater.from(context).inflate(R.layout.notes_netego_view, viewGroup, false);
            C14360o3.A07(A00);
            C92854Eb c92854Eb = new C92854Eb(fragment, interfaceC11380iw, userSession);
            int i2 = C3OO.FLAG_ADAPTER_FULLUPDATE;
            C57112jm A002 = C57112jm.A00();
            LayoutInflater from = LayoutInflater.from(context);
            C14360o3.A07(from);
            C4FA c4fa = new C4FA(from, A00, (AbstractC59962oe) fragment, interfaceC11380iw, userSession, A002, null, c92854Eb);
            c92854Eb.A00 = new C4FU(c4fa);
            A00.setTag(new C4FV(A00, c4fa, c92854Eb));
        } else {
            A00 = C693539v.A00(this.A03, viewGroup, "v1", 2);
        }
        C0f9.A0A(3270448, A03);
        return A00;
    }
}
