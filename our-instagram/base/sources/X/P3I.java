package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.archive.fragment.ArchiveHomeFragment;
import com.instagram.modal.ModalActivity;
import com.instagram.shopping.model.taggingfeed.ProductCollectionFeedTaggingMeta;
import com.instagram.simplewebview.SimpleWebViewActivity;
import com.instagram.tagging.activity.TaggingActivity;

/* loaded from: classes9.dex */
public final class P3I implements InterfaceC58152PqH {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public P3I(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    @Override // X.InterfaceC58152PqH
    public final void onButtonClick(View view) {
        C140966Yy A0r;
        switch (this.A00) {
            case 0:
                A0r = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r.A0D(new ArchiveHomeFragment());
                break;
            case 1:
                Bundle A0b = AbstractC166987dD.A0b();
                A0b.putSerializable("archive_stories_tab", EnumC53169NfQ.A04);
                A0b.putSerializable("archive_home_tab_mode", EnumC53271Nh9.A09);
                A0r = AbstractC25225BEi.A0r((FragmentActivity) this.A01, (AbstractC12990ll) this.A02);
                A0r.A0B(A0b, new ArchiveHomeFragment());
                break;
            case 2:
                TaggingActivity taggingActivity = (TaggingActivity) this.A02;
                taggingActivity.A0E = (ProductCollectionFeedTaggingMeta) this.A01;
                TaggingActivity.A0Q(taggingActivity, true);
                return;
            case 3:
                C54990OTy.A00((C54990OTy) this.A01, C05F.A0u);
                AbstractC166987dD.A1Y(this.A02);
                return;
            case 4:
                N7K n7k = (N7K) this.A02;
                n7k.A0E.getValue();
                OLM olm = (OLM) n7k.A0D.getValue();
                String str = n7k.A07;
                AbstractC167017dG.A1N(olm, str);
                olm.A02("upsell_snackbar", str, "comment_block_comments_from", "block_comments_from_review");
                Bundle A0b2 = AbstractC166987dD.A0b();
                A0b2.putString(DialogModule.KEY_TITLE, ((Context) this.A01).getString(2131976322));
                AbstractC25230BEn.A1A(n7k, AbstractC31171DnF.A0L(n7k.getActivity(), A0b2, AbstractC166987dD.A0o(n7k.A0A), ModalActivity.class, AbstractC111324zv.A00(4156)));
                return;
            case 5:
                C35133Fea c35133Fea = SimpleWebViewActivity.A02;
                Context context = (Context) this.A01;
                C35133Fea.A01(context, (AbstractC12990ll) this.A02, c35133Fea, new SXK("https://help.instagram.com/520831036611383"), context.getString(2131965052));
                return;
            default:
                int intValue = ((C51953Mxa) this.A01).A03.intValue();
                if (intValue != 0) {
                    if (intValue == 1) {
                        C1XH A00 = FB6.A00();
                        C59952od c59952od = (C59952od) this.A02;
                        A00.A05(c59952od.requireActivity(), C59952od.A01(c59952od));
                        return;
                    }
                    throw B4Z.A00();
                }
                return;
        }
        A0r.A08();
        A0r.A04();
    }

    @Override // X.InterfaceC58152PqH
    public final void onDismiss() {
    }

    @Override // X.InterfaceC58152PqH
    public final void onShow() {
    }

    @Override // X.InterfaceC58152PqH
    public final /* synthetic */ void onTextClick(View view) {
    }
}
