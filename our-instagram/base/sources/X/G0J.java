package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import android.os.Parcelable;
import com.instagram.modal.TransparentModalActivity;
import java.io.File;
import java.io.IOException;

/* loaded from: classes6.dex */
public final class G0J implements XCU {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    public G0J(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        this.A00 = i;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = obj5;
    }

    @Override // X.XCU
    public final void onFailure(Exception exc) {
        Context context;
        String str;
        switch (this.A00) {
            case 0:
                C14360o3.A0B(exc, 0);
                context = (Context) this.A02;
                AbstractC167007dF.A15(C18950wb.A01.AEp("IGBloksActionFanClubCreateWelcomeStoryImpl", 817892933), "IGBloksActionFanClubCreateWelcomeStoryImpl", exc.getMessage(), exc);
                str = "shareToStory_unknown_error_occurred";
                break;
            case 1:
                context = (Context) this.A01;
                str = "shareInfoCenterToStory_unknown_error_occured";
                break;
            case 2:
                context = (Context) this.A01;
                str = "shareInfoCenterFactToStory_unknown_error_occured";
                break;
            default:
                context = (Context) this.A01;
                str = MSV.A00(88);
                break;
        }
        C9GR.A0C(context, str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v10, types: [android.content.Context] */
    @Override // X.XCU
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        Bundle A0b;
        AbstractC12990ll abstractC12990ll;
        Class<TransparentModalActivity> cls;
        int i;
        Activity activity;
        int i2;
        Activity activity2;
        C6XJ c6xj;
        switch (this.A00) {
            case 0:
                try {
                    Bundle A00 = AbstractC61636Rr0.A00(AbstractC25230BEn.A1b(AbstractC111324zv.A00(285), AbstractC166997dE.A0Z(obj).getCanonicalPath()));
                    AbstractC12990ll abstractC12990ll2 = (AbstractC12990ll) this.A05;
                    Activity activity3 = (Activity) this.A01;
                    C6XJ A02 = C6XJ.A02(activity3, A00, abstractC12990ll2, TransparentModalActivity.class, AbstractC111324zv.A00(2347));
                    ((C25671My) this.A03).A01((InterfaceC41501vz) this.A04, AnonymousClass485.class);
                    c6xj = A02;
                    activity2 = activity3;
                    c6xj.A0C(activity2);
                } catch (IOException e) {
                    Context context = (Context) this.A02;
                    AbstractC167007dF.A15(C18950wb.A01.AEp("IGBloksActionFanClubCreateWelcomeStoryImpl", 817892933), "IGBloksActionFanClubCreateWelcomeStoryImpl", e.getMessage(), e);
                    C9GR.A0C(context, "shareToStory_unknown_error_occurred");
                    return;
                }
            case 1:
                A0b = AbstractC166987dD.A0b();
                A0b.putParcelable(AbstractC111324zv.A00(92), (RectF) this.A02);
                A0b.putParcelable(AbstractC111324zv.A00(93), (RectF) this.A03);
                A0b.putString(AbstractC111324zv.A00(91), ((File) obj).getAbsolutePath());
                A0b.putParcelable(AbstractC111324zv.A00(1752), (Parcelable) this.A04);
                A0b.putParcelable(AbstractC111324zv.A00(90), null);
                abstractC12990ll = (AbstractC12990ll) this.A05;
                cls = TransparentModalActivity.class;
                i = 2970;
                activity = (Activity) this.A01;
                break;
            case 2:
                File file = (File) obj;
                A0b = AbstractC166987dD.A0b();
                A0b.putParcelable(AbstractC111324zv.A00(92), (RectF) this.A02);
                A0b.putParcelable(AbstractC111324zv.A00(93), (RectF) this.A03);
                A0b.putParcelable(AbstractC111324zv.A00(90), null);
                try {
                    A0b.putString(AbstractC111324zv.A00(91), file.getCanonicalPath());
                } catch (IOException unused) {
                    i2 = 1607;
                    C0w9.A03("ReelInfoCenterShareHelper", AbstractC111324zv.A00(i2));
                    A0b.putParcelable(AbstractC111324zv.A00(1751), (Parcelable) this.A04);
                    abstractC12990ll = (AbstractC12990ll) this.A05;
                    cls = TransparentModalActivity.class;
                    i = 2969;
                    activity = (Activity) this.A01;
                    c6xj = C6XJ.A02(activity, A0b, abstractC12990ll, cls, AbstractC111324zv.A00(i));
                    activity2 = activity;
                    c6xj.A0C(activity2);
                } catch (SecurityException unused2) {
                    i2 = 1608;
                    C0w9.A03("ReelInfoCenterShareHelper", AbstractC111324zv.A00(i2));
                    A0b.putParcelable(AbstractC111324zv.A00(1751), (Parcelable) this.A04);
                    abstractC12990ll = (AbstractC12990ll) this.A05;
                    cls = TransparentModalActivity.class;
                    i = 2969;
                    activity = (Activity) this.A01;
                    c6xj = C6XJ.A02(activity, A0b, abstractC12990ll, cls, AbstractC111324zv.A00(i));
                    activity2 = activity;
                    c6xj.A0C(activity2);
                }
                A0b.putParcelable(AbstractC111324zv.A00(1751), (Parcelable) this.A04);
                abstractC12990ll = (AbstractC12990ll) this.A05;
                cls = TransparentModalActivity.class;
                i = 2969;
                activity = (Activity) this.A01;
            default:
                File A0Z = AbstractC166997dE.A0Z(obj);
                Bundle bundle = (Bundle) this.A02;
                bundle.putString(AbstractC111324zv.A00(1757), A0Z.getCanonicalPath());
                AbstractC12990ll abstractC12990ll3 = (AbstractC12990ll) this.A05;
                Activity activity4 = (Activity) this.A01;
                ?? r4 = (Context) this.A03;
                InterfaceC1119353f interfaceC1119353f = (InterfaceC1119353f) this.A04;
                C6XJ A022 = C6XJ.A02(activity4, bundle, abstractC12990ll3, TransparentModalActivity.class, AbstractC111324zv.A00(1215));
                A022.A0E(interfaceC1119353f);
                c6xj = A022;
                activity2 = r4;
                c6xj.A0C(activity2);
        }
        c6xj = C6XJ.A02(activity, A0b, abstractC12990ll, cls, AbstractC111324zv.A00(i));
        activity2 = activity;
        c6xj.A0C(activity2);
    }
}
