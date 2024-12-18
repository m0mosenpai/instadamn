package X;

import android.content.Context;
import android.content.res.Resources;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.R;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import java.text.DecimalFormat;

/* renamed from: X.7g2, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C168687g2 extends AbstractC168697g3 {
    public final Context A00;
    public final InterfaceC11380iw A01;
    public final UserSession A02;
    public final boolean A03;
    public final boolean A04;

    @Override // X.InterfaceC65642y0
    public final int getViewTypeCount() {
        return 2;
    }

    @Override // X.InterfaceC65642y0
    public final /* bridge */ /* synthetic */ void buildRowViewTypes(AnonymousClass306 anonymousClass306, Object obj, Object obj2) {
        int i = 0;
        if (this.A04) {
            i = 1;
        }
        anonymousClass306.A7a(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v9, types: [X.9uz, java.lang.Object] */
    @Override // X.InterfaceC65642y0
    public final View getView(int i, View view, ViewGroup viewGroup, Object obj, Object obj2) {
        int i2;
        String quantityString;
        TextView textView;
        boolean z;
        int i3;
        View view2;
        int A03 = C0f9.A03(34258545);
        View view3 = view;
        if (view == null) {
            Context context = this.A00;
            int A032 = C0f9.A03(-907365454);
            if (i != 0) {
                if (i == 1) {
                    i3 = 470599682;
                    view2 = C70182WFk.A00(context, viewGroup);
                } else {
                    UnsupportedOperationException unsupportedOperationException = new UnsupportedOperationException(AbstractC43591JPw.A00(122));
                    C0f9.A0A(-1867648190, A032);
                    throw unsupportedOperationException;
                }
            } else {
                View inflate = LayoutInflater.from(context).inflate(R.layout.row_autocomplete_hashtag, viewGroup, false);
                ?? obj3 = new Object();
                obj3.A01 = (TextView) inflate.requireViewById(R.id.row_hashtag_textview_tag_name);
                obj3.A00 = (TextView) inflate.requireViewById(R.id.row_hashtag_textview_media_count);
                inflate.setTag(obj3);
                i3 = -977914284;
                view2 = inflate;
            }
            C0f9.A0A(i3, A032);
            view3 = view2;
        }
        Hashtag hashtag = (Hashtag) obj;
        int A033 = C0f9.A03(-1296400035);
        if (i != 0) {
            if (i == 1) {
                UserSession userSession = this.A02;
                Context context2 = this.A00;
                InterfaceC11380iw interfaceC11380iw = this.A01;
                HashtagImpl F59 = hashtag.F59().F59();
                Tx0 tx0 = new Tx0(new C65954Twz());
                Object tag = view3.getTag();
                tag.getClass();
                C69652Vst c69652Vst = (C69652Vst) tag;
                boolean z2 = this.A03;
                C14360o3.A0B(userSession, 0);
                C14360o3.A0B(context2, 1);
                C14360o3.A0B(interfaceC11380iw, 2);
                C14360o3.A0B(c69652Vst, 7);
                ImageView imageView = c69652Vst.A04;
                Boolean bool = F59.A07;
                if (bool != null) {
                    z = bool.booleanValue();
                } else {
                    z = false;
                }
                C70182WFk.A01(context2, imageView, interfaceC11380iw, F59, !z);
                C70182WFk.A02(imageView);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(AbstractC13670mt.A06("#%s", F59.A0D));
                AbstractC85513rg.A00(userSession).A01(spannableStringBuilder);
                c69652Vst.A05.setText(spannableStringBuilder);
                C70182WFk.A03(F59, tx0, c69652Vst, z2, false);
                c69652Vst.A00();
            } else {
                UnsupportedOperationException unsupportedOperationException2 = new UnsupportedOperationException(AbstractC111324zv.A00(342));
                C0f9.A0A(870476219, A033);
                throw unsupportedOperationException2;
            }
        } else {
            Context context3 = this.A00;
            Object tag2 = view3.getTag();
            tag2.getClass();
            C224159uz c224159uz = (C224159uz) tag2;
            boolean z3 = this.A03;
            c224159uz.A01.setText(AbstractC13670mt.A06("#%s", hashtag.getName()));
            if (z3) {
                c224159uz.A00.setVisibility(8);
            } else {
                if (hashtag.CXj() != null && hashtag.CXj().booleanValue()) {
                    textView = c224159uz.A00;
                    quantityString = context3.getResources().getString(2131971540).toLowerCase();
                } else {
                    Resources resources = context3.getResources();
                    if (hashtag.BQb() != null) {
                        i2 = hashtag.BQb().intValue();
                    } else {
                        i2 = 0;
                    }
                    C14360o3.A0B(resources, 0);
                    if (i2 <= 0) {
                        quantityString = "";
                    } else {
                        DecimalFormat decimalFormat = new DecimalFormat();
                        decimalFormat.setGroupingUsed(true);
                        decimalFormat.setMaximumFractionDigits(0);
                        quantityString = resources.getQuantityString(R.plurals.number_of_public_posts, i2, decimalFormat.format(i2));
                        C14360o3.A0A(quantityString);
                    }
                    textView = c224159uz.A00;
                }
                textView.setText(quantityString);
                textView.setVisibility(0);
            }
        }
        C0f9.A0A(-529641284, A033);
        C0f9.A0A(-1416080654, A03);
        return view3;
    }

    public C168687g2(Context context, InterfaceC11380iw interfaceC11380iw, UserSession userSession, boolean z) {
        this.A00 = context;
        this.A01 = interfaceC11380iw;
        this.A04 = z;
        this.A02 = userSession;
        C14360o3.A0B(userSession, 0);
        this.A03 = C18U.A06(C06090Tz.A05, userSession, 36323350171102393L);
    }
}
