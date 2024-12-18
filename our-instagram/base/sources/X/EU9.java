package X;

import android.util.LruCache;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.react.modules.dialog.DialogModule;
import com.google.common.collect.ImmutableList;
import com.instagram.business.fragment.CategorySearchFragment;

/* loaded from: classes6.dex */
public final class EU9 extends C1P1 {
    public final /* synthetic */ CategorySearchFragment A00;

    public EU9(CategorySearchFragment categorySearchFragment) {
        this.A00 = categorySearchFragment;
    }

    @Override // X.C1P1
    public final void onFail(AbstractC115105If abstractC115105If) {
        int A0N = AbstractC167017dG.A0N(abstractC115105If, -822482520);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        String str = categorySearchFragment.A0D;
        ImmutableList of = ImmutableList.of();
        C14360o3.A07(of);
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = of;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0e()) {
                CategorySearchFragment.A06(categorySearchFragment);
            }
        }
        String A03 = AbstractC151876sX.A03(abstractC115105If, AbstractC31173DnH.A0m(categorySearchFragment));
        C14360o3.A07(A03);
        CategorySearchFragment.A0A(categorySearchFragment, "searched_category", A03, "category_search_keyword", categorySearchFragment.A0D);
        C0f9.A0A(-1742460736, A0N);
    }

    @Override // X.C1P1
    public final void onFinish() {
        int A03 = C0f9.A03(-1160131583);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        categorySearchFragment.A0H = false;
        if (categorySearchFragment.getActivity() != null) {
            AbstractC31178DnM.A0v(categorySearchFragment);
        }
        C0f9.A0A(-149553533, A03);
    }

    @Override // X.C1P1
    public final void onStart() {
        int A03 = C0f9.A03(-1566317790);
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        categorySearchFragment.A0H = true;
        if (categorySearchFragment.getActivity() != null) {
            AbstractC31178DnM.A0v(categorySearchFragment);
        }
        C0f9.A0A(-1714638605, A03);
    }

    @Override // X.C1P1
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        ImmutableList A02;
        AbstractC907342m abstractC907342m;
        int A03 = C0f9.A03(773374172);
        AnonymousClass435 anonymousClass435 = (AnonymousClass435) obj;
        int A0N = AbstractC167017dG.A0N(anonymousClass435, -1224091556);
        Object obj2 = anonymousClass435.A01;
        AbstractC907342m abstractC907342m2 = null;
        if (obj2 != null && (abstractC907342m = (AbstractC907342m) obj2) != null) {
            abstractC907342m2 = abstractC907342m.A00(E51.class, "ig_business_categories_typeahead");
        }
        CategorySearchFragment categorySearchFragment = this.A00;
        CallerContext callerContext = CategorySearchFragment.A0U;
        String str = categorySearchFragment.A0D;
        LruCache lruCache = C34934FaK.A01;
        ImmutableList.Builder builder = new ImmutableList.Builder();
        if (abstractC907342m2 != null && abstractC907342m2.A02(DialogModule.KEY_ITEMS, E50.class) != null && !abstractC907342m2.A02(DialogModule.KEY_ITEMS, E50.class).isEmpty()) {
            C1LC it = abstractC907342m2.A02(DialogModule.KEY_ITEMS, E50.class).iterator();
            C14360o3.A07(it);
            while (it.hasNext()) {
                AbstractC907342m abstractC907342m3 = (AbstractC907342m) it.next();
                String A05 = abstractC907342m3.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                String A052 = abstractC907342m3.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                String A053 = abstractC907342m3.A05("account_type");
                if (A053 == null) {
                    A053 = "";
                }
                if (A05 != null && A05.length() != 0 && A052 != null && A052.length() != 0) {
                    builder.add((Object) new C36213FyR(C16Z.A01(A053), A05, A052));
                }
            }
        }
        ImmutableList A0K = AbstractC31172DnG.A0K(builder);
        if (str != null && str.equals(categorySearchFragment.A0D)) {
            categorySearchFragment.A02 = A0K;
            categorySearchFragment.A0I = true;
            if (categorySearchFragment.A0e()) {
                CategorySearchFragment.A06(categorySearchFragment);
            }
        }
        if (abstractC907342m2 != null && (A02 = abstractC907342m2.A02(DialogModule.KEY_ITEMS, E50.class)) != null) {
            i = A02.size();
        } else {
            i = 0;
        }
        CategorySearchFragment.A09(categorySearchFragment, "searched_category", "category_search_keyword", categorySearchFragment.A0D, i);
        C0f9.A0A(750091908, A0N);
        C0f9.A0A(-640376162, A03);
    }
}
