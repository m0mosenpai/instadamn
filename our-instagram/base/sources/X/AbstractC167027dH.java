package X;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.os.BaseBundle;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.widget.EditText;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.transformmatrix.model.TransformMatrixParams;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.react.modules.dialog.DialogModule;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.debughead.models.AggregateScrollData;
import com.instagram.debug.devoptions.debughead.models.ScrollPerfData;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import com.instagram.user.model.User;
import java.io.File;
import java.util.AbstractCollection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.7dH, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC167027dH {
    public static Bitmap A04(Bitmap bitmap) {
        int width = bitmap.getWidth();
        int height = bitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(224.0f / width, 224.0f / height);
        C0fK.A03(bitmap);
        Bitmap createBitmap = Bitmap.createBitmap(bitmap, 0, 0, width, height, matrix, false);
        C14360o3.A07(createBitmap);
        bitmap.recycle();
        return createBitmap;
    }

    public static RectF A07(Fragment fragment, Object obj) {
        C14360o3.A0B(obj, 0);
        int A0A = AbstractC13880nE.A0A(fragment.requireContext());
        float A09 = AbstractC13880nE.A09(fragment.requireContext());
        RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
        rectF.offsetTo(0.0f, A09);
        return rectF;
    }

    public static SpannableStringBuilder A0A(SpannableStringBuilder spannableStringBuilder, UserSession userSession, int i, int i2) {
        int A07 = AbstractC13950nL.A07(i2, i / 255.0f);
        C85383rT c85383rT = new C85383rT(spannableStringBuilder, userSession);
        c85383rT.A01 = A07;
        c85383rT.A03(null);
        c85383rT.A03 = A07;
        c85383rT.A02(null);
        SpannableStringBuilder A00 = c85383rT.A00();
        C14360o3.A07(A00);
        return A00;
    }

    public static TransformMatrixParams A0E() {
        Integer num = C05F.A00;
        return new TransformMatrixParams(num, num, 1.0f, 0.0f, 0.0f, 0.0f, false);
    }

    public static C1580177l A0I(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988, Object obj) {
        return AbstractC1575875s.A00(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C77Z((InterfaceC164887Zb) obj, 1, 0, false), interfaceC165247aD, anonymousClass988);
    }

    public static C162907Rb A0J(InterfaceC165247aD interfaceC165247aD, AnonymousClass988 anonymousClass988) {
        boolean z = anonymousClass988.A1U;
        C7AZ c7az = new C7AZ(z);
        InterfaceC165507ad interfaceC165507ad = (InterfaceC165507ad) interfaceC165247aD;
        return new C162907Rb(AbstractC16960so.A1Q(new C1580177l(new C162897Ra((InterfaceC165207a9) interfaceC165247aD), new C158947Bg(interfaceC165247aD), c7az.A00(interfaceC165247aD), new C7Q9((InterfaceC165307aJ) interfaceC165247aD, z), interfaceC165507ad, anonymousClass988, null, false), c7az));
    }

    public static void A0e(RectF rectF, float f, float f2) {
        rectF.left = f - f2;
        rectF.right += f2;
        rectF.top -= f2;
        rectF.bottom += f2;
    }

    public static void A0f(RectF rectF, Drawable drawable, float f, float f2, float f3) {
        drawable.setBounds(C1H4.A01(f - f2), C1H4.A01(rectF.top - f3), C1H4.A01(rectF.right + f3), C1H4.A01(rectF.bottom + f3));
    }

    public static void A0i(Drawable drawable, Runnable runnable) {
        C14360o3.A0B(runnable, 1);
        drawable.unscheduleSelf(runnable);
    }

    public static void A0j(Drawable drawable, Runnable runnable, long j) {
        C14360o3.A0B(runnable, 1);
        drawable.scheduleSelf(runnable, j);
    }

    public static void A0k(IBinder iBinder, Parcel parcel, Parcel parcel2, int i) {
        iBinder.transact(i, parcel, parcel2, 0);
        parcel2.readException();
    }

    public static void A0l(Parcel parcel, Enum r2) {
        C14360o3.A0B(parcel, 0);
        parcel.writeInt(r2.ordinal());
    }

    public static void A0m(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeFloat(number.floatValue());
        }
    }

    public static void A0n(Parcel parcel, Number number) {
        if (number == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(number.longValue());
        }
    }

    public static void A0p(Parcel parcel, List list, int i) {
        Parcelable parcelable = (Parcelable) list.get(i);
        if (parcelable != null) {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 0);
        } else {
            parcel.writeInt(0);
        }
    }

    public static void A0r(ImageView imageView, Object obj) {
        Object drawable = imageView.getDrawable();
        if (!C14360o3.A0K(drawable, obj)) {
            if (drawable instanceof C5RP) {
                ((C5RP) drawable).AHq();
                return;
            }
            if (drawable instanceof C9S2) {
                C9S2 c9s2 = (C9S2) drawable;
                if (!c9s2.A00) {
                    return;
                }
                c9s2.A00 = false;
                return;
            }
            if (drawable instanceof C9S4) {
                C9S4 c9s4 = (C9S4) drawable;
                if (!c9s4.A00) {
                    return;
                }
                c9s4.A00 = false;
                return;
            }
            if (drawable instanceof C68000V5s) {
                C68000V5s c68000V5s = (C68000V5s) drawable;
                if (!c68000V5s.A00) {
                    return;
                }
                c68000V5s.A00 = false;
                return;
            }
            if (drawable instanceof C221499qE) {
                ((C221499qE) drawable).A00 = false;
            } else {
                if (!(drawable instanceof C9S9)) {
                    return;
                }
                ((C9S9) drawable).A00 = false;
            }
        }
    }

    public static void A11(AggregateScrollData aggregateScrollData) {
        aggregateScrollData.mSumUtil = 0.0f;
        aggregateScrollData.mSum1Drop = 0.0f;
        aggregateScrollData.mSum4Drop = 0.0f;
        aggregateScrollData.mAvgUtil = 0.0f;
        aggregateScrollData.mAvg1Drop = 0.0f;
        aggregateScrollData.mAvg4Drop = 0.0f;
        aggregateScrollData.mContainer = "";
        aggregateScrollData.mMinUtil = 0.0f;
        aggregateScrollData.mMin1Drop = 0.0f;
        aggregateScrollData.mMin4Drop = 0.0f;
        aggregateScrollData.mMaxUtil = 0.0f;
        aggregateScrollData.mMax1Drop = 0.0f;
        aggregateScrollData.mMax4Drop = 0.0f;
        aggregateScrollData.mTotalTimeSpent = 0.0f;
    }

    public static void A12(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 0);
        C14360o3.A0B(obj2, 1);
        C14360o3.A0B(obj3, 2);
    }

    public static void A13(Object obj, Object obj2, Object obj3) {
        C14360o3.A0B(obj, 1);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(obj3, 3);
    }

    public static int A00(C6RB c6rb) {
        return (int) c6rb.A0b.measureText(c6rb.A0F.toString());
    }

    public static long A03(String str) {
        Long A0k = AbstractC003100w.A0k(10, str);
        if (A0k != null) {
            return A0k.longValue();
        }
        return 0L;
    }

    public static Bitmap A05(Object obj, Object obj2) {
        if (obj instanceof BitmapDrawable) {
            return ((BitmapDrawable) obj2).getBitmap();
        }
        if (obj instanceof C8FY) {
            return ((C8FY) obj2).A07;
        }
        if (obj instanceof C210399Se) {
            return AbstractC209669Pc.A01(((C210399Se) obj).A0B.A0X, 0L);
        }
        return null;
    }

    public static Bundle A08(int i) {
        return AbstractC61636Rr0.A00(new C09530e4("serviceType", Integer.valueOf(i)));
    }

    public static Bundle A09(Object obj, Object obj2, C09530e4 c09530e4, C09530e4 c09530e42, C09530e4 c09530e43) {
        return AbstractC61636Rr0.A00(c09530e4, c09530e42, c09530e43, new C09530e4(obj, obj2));
    }

    public static C018307d A0B(Object obj) {
        return ((InterfaceC018407e) ((InterfaceC09390do) obj).getValue()).getViewModelStore();
    }

    public static C4OU A0F() {
        C173847oc c173847oc = C173847oc.A00;
        return new C4OU(new C4OM[]{new C4OW(c173847oc, IgReactMediaPickerNativeModule.HEIGHT), new C4OW(c173847oc, IgReactMediaPickerNativeModule.WIDTH), new C4OW(c173847oc, "x"), new C4OW(c173847oc, "y"), new C4OW(C94894Ou.A00, "z"), new C4OW(c173847oc, "rotation")});
    }

    public static C0f5 A0G(String str) {
        C0f5 AEp = C18950wb.A01.AEp("ImageTextureProvider_null_texture", 817900495);
        AEp.ABW(DialogModule.KEY_MESSAGE, AnonymousClass001.A0R("path=", str));
        return AEp;
    }

    public static C148336m3 A0K(String str, int i) {
        return new C148336m3(str, i);
    }

    public static User A0L(AbstractC67881V0m abstractC67881V0m) {
        UserSession userSession = abstractC67881V0m.A00;
        C14360o3.A07(userSession);
        return C08730cb.A00(userSession).A00();
    }

    public static File A0M(File file, File file2, String str) {
        File file3 = new File(file, str);
        AbstractC13530mf.A08(file3);
        File file4 = new File(file3, "assets");
        AbstractC13530mf.A08(file4);
        File createTempFile = File.createTempFile("asset", AnonymousClass001.A0D(MT6.A01(file2), '.'), file4);
        C14360o3.A07(createTempFile);
        return createTempFile;
    }

    public static String A0Q(Object obj) {
        String str = (String) obj;
        C14360o3.A0B(str, 0);
        return str;
    }

    public static String A0R(StringBuilder sb) {
        sb.append('}');
        return sb.toString();
    }

    public static EnumC09460dv A0V() {
        return (EnumC09460dv) AbstractC15930qn.A02.A0L.invoke();
    }

    public static C141786av A0W() {
        return new C141786av("An operation is not implemented.");
    }

    public static C09530e4 A0X() {
        return new C09530e4("serviceType", 58);
    }

    public static C09530e4 A0Y(Object obj) {
        return new C09530e4("commandType", obj);
    }

    public static void A0Z(int i) {
        GLES20.glBindTexture(3553, i);
        GLES20.glTexParameteri(3553, 10241, 9729);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 33071);
        GLES20.glTexParameteri(3553, 10243, 33071);
    }

    public static void A0o(Parcel parcel, Number number, int i, int i2) {
        if (number == null) {
            parcel.writeInt(i);
        } else {
            parcel.writeInt(i2);
            parcel.writeInt(number.intValue());
        }
    }

    public static void A0t(InterfaceC02590Ai interfaceC02590Ai, String str) {
        interfaceC02590Ai.AAP("action", str);
        String obj = UUID.randomUUID().toString();
        C14360o3.A07(obj);
        interfaceC02590Ai.AAP(AbstractC31198Dnh.A00(), obj);
    }

    public static void A0v(C0f5 c0f5, Throwable th, int i, int i2, boolean z) {
        c0f5.ABU(IgReactMediaPickerNativeModule.WIDTH, i);
        c0f5.ABU(IgReactMediaPickerNativeModule.HEIGHT, i2);
        c0f5.ABX("renderStaticStickersIndividually", z);
        c0f5.ERI(th);
        c0f5.report();
    }

    public static void A10(C447024a c447024a) {
        C24P c24p = c447024a.A00;
        String.valueOf(c24p.A00.A0J());
        String.valueOf(c24p.A00());
    }

    public static void A14(Object obj, Object obj2, List list, C09530e4 c09530e4, C09530e4 c09530e42) {
        list.add(AbstractC61636Rr0.A00(c09530e4, c09530e42, new C09530e4(obj, obj2)));
    }

    public static void A15(Object obj, List list, C09530e4 c09530e4) {
        list.add(AbstractC61636Rr0.A00(c09530e4, new C09530e4("commandType", obj)));
    }

    public static void A16(Object obj, InterfaceC16530ry interfaceC16530ry, C0YR[] c0yrArr, int i) {
        int intValue = ((Number) interfaceC16530ry.CES(obj, c0yrArr[i])).intValue() + 1;
        interfaceC16530ry.Egi(obj, Integer.valueOf(intValue), c0yrArr[i]);
    }

    public static int A01(InterfaceC09390do interfaceC09390do) {
        return ((Number) interfaceC09390do.getValue()).intValue();
    }

    public static int A02(InterfaceC09390do interfaceC09390do) {
        return ((Drawable) interfaceC09390do.getValue()).getIntrinsicHeight();
    }

    public static RectF A06(Fragment fragment) {
        Context requireContext = fragment.requireContext();
        int A0A = AbstractC13880nE.A0A(requireContext);
        float A09 = AbstractC13880nE.A09(requireContext);
        RectF rectF = new RectF(0.0f, 0.0f, A0A, A09);
        rectF.offsetTo(0.0f, A09);
        return rectF;
    }

    public static C22P A0C(BaseBundle baseBundle, String str) {
        if (baseBundle.get(str) instanceof C22P) {
            return (C22P) baseBundle.get(str);
        }
        return C22P.A5N;
    }

    public static C22P A0D(BaseBundle baseBundle, String str) {
        if (baseBundle.get(str) instanceof C22P) {
            Object obj = baseBundle.get(str);
            C14360o3.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            return (C22P) obj;
        }
        return C22P.A5N;
    }

    public static C6RL A0H(Context context, Drawable drawable) {
        C6RK c6rk = new C6RK(context, drawable, context.getResources().getDimensionPixelSize(R.dimen.iglive_sup_toggle_view_height));
        c6rk.A07 = context.getResources().getString(2131968855);
        c6rk.A02(R.dimen.add_payment_bottom_sheet_row_subtitle_size);
        c6rk.A03 = LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT;
        return c6rk.A00();
    }

    public static Number A0N(ScrollPerfData scrollPerfData, List list, int i) {
        scrollPerfData.getFieldValue((String) list.get(i));
        return (Number) scrollPerfData.getFieldValue((String) list.get(i));
    }

    public static Object A0O(Parcel parcel, Iterator it) {
        Map.Entry entry = (Map.Entry) it.next();
        parcel.writeString((String) entry.getKey());
        return entry.getValue();
    }

    public static String A0P(Context context, int i) {
        return C02G.A01(context).getString(i);
    }

    public static HashSet A0S(String str, String str2, String str3) {
        return AbstractC16830sb.A05(str, str2, str3);
    }

    public static HashSet A0T(String str, String str2, String str3, String str4) {
        return AbstractC16830sb.A05(str, str2, str3, str4);
    }

    public static HashSet A0U(String str, String str2, String str3, String str4, String str5) {
        return AbstractC16830sb.A05(str, str2, str3, str4, str5);
    }

    public static void A0a(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        C14360o3.A0B(obj, i);
        C14360o3.A0B(obj2, 2);
        C14360o3.A0B(obj3, 3);
        C14360o3.A0B(obj4, 4);
    }

    public static void A0b(Context context, Drawable.Callback callback, C6RB c6rb, int i) {
        c6rb.A0G(i, context.getString(2131961704));
        c6rb.setCallback(callback);
    }

    public static void A0c(Context context, C6RB c6rb, int i) {
        c6rb.A0A(AbstractC13880nE.A04(context, i));
    }

    public static void A0d(ColorFilter colorFilter, Drawable drawable) {
        drawable.mutate().setColorFilter(colorFilter);
    }

    public static void A0g(Drawable drawable) {
        drawable.setBounds(drawable.getBounds().left, drawable.getBounds().top, drawable.getBounds().right, drawable.getBounds().bottom);
        drawable.invalidateSelf();
    }

    public static void A0h(Drawable drawable, int i) {
        drawable.mutate().setAlpha(i);
    }

    public static void A0q(EditText editText, int i, int i2) {
        if (editText.getText().length() > 0 && i < 1) {
            editText.setSelection(1, Math.max(i2, 1));
        }
    }

    public static void A0s(InterfaceC02530Ab interfaceC02530Ab, InterfaceC02590Ai interfaceC02590Ai, C22M c22m, String str) {
        interfaceC02590Ai.A8R(interfaceC02530Ab, str);
        interfaceC02590Ai.A9K("capture_format_index", 0L);
        interfaceC02590Ai.AAP("discovery_session_id", c22m.A0O);
    }

    public static void A0u(InterfaceC02590Ai interfaceC02590Ai, String str, String str2) {
        interfaceC02590Ai.AAP(str, str2);
        interfaceC02590Ai.AAP("device_fold_orientation", AbstractC82673mV.A00);
        interfaceC02590Ai.AAP("device_fold_state", AbstractC82683mW.A00);
        interfaceC02590Ai.A7v("device_is_in_multi_window_mode", AbstractC82693mX.A00);
        interfaceC02590Ai.AAP("device_aspect_ratio_category", AbstractC82663mU.A00);
        interfaceC02590Ai.Cht();
    }

    public static void A0w(C16L c16l, AbstractCollection abstractCollection) {
        String A1P;
        if (c16l.A11() != C16R.A0G && (A1P = c16l.A1P()) != null) {
            abstractCollection.add(A1P);
        }
    }

    public static void A0x(C25621Ms c25621Ms, C1P1 c1p1, String str, String str2) {
        c25621Ms.A9s(str, str2);
        c25621Ms.A0R(N3F.class, C54911OQi.class);
        C1ON A0N = c25621Ms.A0N();
        A0N.A00 = c1p1;
        C1GJ.A03(A0N);
    }

    public static void A0y(C18950wb c18950wb, String str) {
        C0f5 AEp = c18950wb.AEp(str, 817902403);
        AEp.ABW("navChain", C1QM.A00.A02.A00);
        AEp.ABW("stackTrace", C2Ql.A00(new Throwable()));
        AEp.report();
    }

    public static void A0z(UserSession userSession) {
        C447624g c447624g = AnonymousClass229.A01(userSession).A04;
        c447624g.A01 = c447624g.A03.A02(518922243, c447624g.A01);
    }

    public static void A17(InterfaceC09390do interfaceC09390do) {
        if (((Dialog) interfaceC09390do.getValue()).isShowing()) {
            ((Dialog) interfaceC09390do.getValue()).dismiss();
        }
    }

    public static boolean A18(UserSession userSession) {
        AnonymousClass229.A01(userSession).A04.A03();
        return C18U.A06(C06090Tz.A06, userSession, 36324307948810331L);
    }

    public static boolean A19(String str, int i) {
        if (C14360o3.A00(str.charAt(i), 32) > 0) {
            return false;
        }
        return true;
    }

    public static boolean A1A(String str, List list, int i) {
        return str.equals(list.get(i));
    }

    public static int[] A1B(Context context, int i) {
        return new int[]{context.getColor(AbstractC53242c7.A0H(context, i)), context.getColor(AbstractC53242c7.A0H(context, i)), context.getColor(AbstractC53242c7.A0H(context, i)), context.getColor(AbstractC53242c7.A0H(context, i)), context.getColor(AbstractC53242c7.A0H(context, i))};
    }
}
