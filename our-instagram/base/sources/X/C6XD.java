package X;

import android.content.DialogInterface;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ProductReviewStatus;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.ProductTag;
import com.instagram.model.shopping.clips.ClipsShoppingInfoIntf;
import com.instagram.tagging.model.TagSerializer;
import com.instagram.user.model.Product;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.6XD, reason: invalid class name */
/* loaded from: classes3.dex */
public final class C6XD {
    public C34625FNi A00;
    public final DialogInterface.OnClickListener A01 = C6XE.A00;
    public final DialogInterface.OnClickListener A02 = new DialogInterface.OnClickListener() { // from class: X.6XF
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            ProductReviewStatus productReviewStatus;
            C6XD c6xd = C6XD.this;
            String str = c6xd.A0D;
            if (str != null && (productReviewStatus = c6xd.A07) != null && productReviewStatus == ProductReviewStatus.A08) {
                C1XJ.A00.A1F(c6xd.A06, c6xd.A08, str, c6xd.A0E);
            } else {
                C12260kU.A0G(c6xd.A06, AbstractC08820cl.A03("https://www.facebook.com/business/help/1944109912526524"));
            }
        }
    };
    public final DialogInterface.OnClickListener A03 = new DialogInterface.OnClickListener() { // from class: X.6XG
        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            Object obj;
            ProductTag productTag;
            C25621Ms c25621Ms;
            String str;
            String str2;
            Object obj2;
            C34625FNi c34625FNi = C6XD.this.A00;
            if (c34625FNi != null) {
                C38321qM c38321qM = c34625FNi.A02;
                if (c38321qM.A5P()) {
                    C3x9 clipsMetadata = c38321qM.A0C.getClipsMetadata();
                    if (clipsMetadata != null) {
                        ClipsShoppingInfoIntf Buh = clipsMetadata.Buh();
                        if (Buh != null) {
                            List BhR = Buh.BhR();
                            if (BhR != null) {
                                Iterator it = BhR.iterator();
                                final C43361JEc c43361JEc = new C43361JEc(c34625FNi, 27);
                                AbstractC63071Sbt.A01(new InterfaceC28041Xi() { // from class: X.Abq
                                    @Override // X.InterfaceC28041Xi
                                    public final /* synthetic */ boolean apply(Object obj3) {
                                        return AbstractC166987dD.A1a(InterfaceC16660sJ.this.invoke(obj3));
                                    }
                                }, it);
                            }
                            C38686GzR A02 = C41722Idt.A00.A02(Buh);
                            c25621Ms = new C25621Ms(c34625FNi.A01, -2);
                            c25621Ms.A05();
                            c25621Ms.A0B(AbstractC13670mt.A06(MSV.A00(56), c38321qM.getId()));
                            c25621Ms.A0R(N3N.class, C41349IRu.class);
                            c25621Ms.A9s(AbstractC37314GcG.A01(0, 9, 28), C16030qx.A00(c34625FNi.A00));
                            c25621Ms.A0R = true;
                            try {
                                c25621Ms.A9s("shopping_data", AbstractC41651Ibj.A00(A02));
                            } catch (IOException e) {
                                e = e;
                                str = "RejectedProductTagNetworkHelper";
                                str2 = "Unable to parse clips shopping metadata";
                                C0w9.A06(str, str2, e);
                                C1ON A0N = c25621Ms.A0N();
                                A0N.A00 = new C32497ESx(c34625FNi);
                                C1GJ.A03(A0N);
                            }
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else if (c38321qM.A63()) {
                    List A3w = c38321qM.A3w(EnumC75383a5.A0y);
                    if (A3w != null) {
                        Product A0H = ((C84823qW) A3w.get(0)).A0H();
                        InterfaceC60442pS interfaceC60442pS = c34625FNi.A03;
                        UserSession userSession = c34625FNi.A01;
                        AbstractC41775Ier.A06(userSession, c38321qM, interfaceC60442pS, A0H);
                        c25621Ms = new C25621Ms(userSession, -2);
                        c25621Ms.A05();
                        String A38 = c38321qM.A38();
                        if (A38 != null) {
                            c25621Ms.A0B(AbstractC13670mt.A06("commerce/story/%s/remove_product_sticker/", A38));
                            c25621Ms.A0R(N3N.class, C41349IRu.class);
                            c25621Ms.A0R = true;
                            c25621Ms.A9s("product_id", c34625FNi.A05);
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    if (c38321qM.A5M()) {
                        for (Object obj3 : new HashMap(c38321qM.A3V()).entrySet()) {
                            C14360o3.A07(obj3);
                            Iterator it2 = ((List) ((Map.Entry) obj3).getValue()).iterator();
                            while (true) {
                                if (it2.hasNext()) {
                                    obj2 = it2.next();
                                    if (C14360o3.A0K(((com.instagram.tagging.model.Tag) obj2).getId(), c34625FNi.A05)) {
                                        break;
                                    }
                                } else {
                                    obj2 = null;
                                    break;
                                }
                            }
                            productTag = (ProductTag) obj2;
                            if (productTag != null) {
                            }
                        }
                        return;
                    }
                    ArrayList A3O = c38321qM.A3O();
                    if (A3O != null) {
                        Iterator it3 = A3O.iterator();
                        while (true) {
                            if (it3.hasNext()) {
                                obj = it3.next();
                                if (C14360o3.A0K(((com.instagram.tagging.model.Tag) obj).getId(), c34625FNi.A05)) {
                                    break;
                                }
                            } else {
                                obj = null;
                                break;
                            }
                        }
                        productTag = (ProductTag) obj;
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                    if (productTag != null) {
                        Product A01 = AbstractC38048Gob.A01(productTag.A02);
                        InterfaceC60442pS interfaceC60442pS2 = c34625FNi.A03;
                        UserSession userSession2 = c34625FNi.A01;
                        AbstractC41775Ier.A06(userSession2, c38321qM, interfaceC60442pS2, A01);
                        c25621Ms = new C25621Ms(userSession2, -2);
                        c25621Ms.A05();
                        c25621Ms.A0B(AbstractC13670mt.A06(MSV.A00(56), c38321qM.getId()));
                        c25621Ms.A0R(N3N.class, C41349IRu.class);
                        c25621Ms.A9s(AbstractC37314GcG.A01(0, 9, 28), C16030qx.A00(c34625FNi.A00));
                        c25621Ms.A0R = true;
                        try {
                            if (c38321qM.A5M()) {
                                HashMap hashMap = new HashMap();
                                for (Map.Entry entry : new HashMap(c38321qM.A3V()).entrySet()) {
                                    List list = (List) entry.getValue();
                                    ArrayList arrayList = new ArrayList();
                                    Iterator it4 = list.iterator();
                                    while (true) {
                                        if (it4.hasNext()) {
                                            com.instagram.tagging.model.Tag tag = (com.instagram.tagging.model.Tag) it4.next();
                                            if (C14360o3.A0K(tag.getId(), c34625FNi.A05)) {
                                                list.remove(tag);
                                                arrayList.add(tag);
                                                break;
                                            }
                                        }
                                    }
                                    hashMap.put(entry.getKey(), TagSerializer.A00(list, arrayList));
                                }
                                String obj4 = new JSONObject(AbstractC06930Yk.A0B(hashMap)).toString();
                                C14360o3.A07(obj4);
                                c25621Ms.AA6("children_product_tags", obj4);
                            } else {
                                String A00 = MSV.A00(1512);
                                ArrayList A3O2 = c38321qM.A3O();
                                if (A3O2 != null) {
                                    ArrayList arrayList2 = new ArrayList();
                                    arrayList2.add(productTag);
                                    A3O2.remove(productTag);
                                    c25621Ms.A9s(A00, TagSerializer.A00(A3O2, arrayList2));
                                } else {
                                    throw new IllegalStateException("Required value was null.");
                                }
                            }
                        } catch (IOException e2) {
                            e = e2;
                            str = "RejectedProductTagNetworkHelper";
                            str2 = "Unable to parse product tag";
                            C0w9.A06(str, str2, e);
                            C1ON A0N2 = c25621Ms.A0N();
                            A0N2.A00 = new C32497ESx(c34625FNi);
                            C1GJ.A03(A0N2);
                        }
                    } else {
                        return;
                    }
                }
                C1ON A0N22 = c25621Ms.A0N();
                A0N22.A00 = new C32497ESx(c34625FNi);
                C1GJ.A03(A0N22);
            }
        }
    };
    public final DialogInterface.OnDismissListener A04;
    public final DialogInterface.OnShowListener A05;
    public final FragmentActivity A06;
    public final ProductReviewStatus A07;
    public final UserSession A08;
    public final C38321qM A09;
    public final InterfaceC60442pS A0A;
    public final InterfaceC146006hx A0B;
    public final String A0C;
    public final String A0D;
    public final boolean A0E;

    public C6XD(DialogInterface.OnDismissListener onDismissListener, DialogInterface.OnShowListener onShowListener, FragmentActivity fragmentActivity, ProductReviewStatus productReviewStatus, UserSession userSession, C38321qM c38321qM, InterfaceC60442pS interfaceC60442pS, InterfaceC146006hx interfaceC146006hx, String str, String str2, boolean z) {
        this.A06 = fragmentActivity;
        this.A0A = interfaceC60442pS;
        this.A08 = userSession;
        this.A0E = z;
        this.A09 = c38321qM;
        this.A0D = str;
        this.A07 = productReviewStatus;
        this.A0C = str2;
        this.A05 = onShowListener;
        this.A04 = onDismissListener;
        this.A0B = interfaceC146006hx;
    }
}
