package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import com.facebook.R;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.graphql.IGDMediaCollageMutationResponseImpl;

/* loaded from: classes8.dex */
public final class LKb {
    public static final LKb A00 = new Object();

    public static final Bitmap A00(Medium medium, Double d) {
        int i;
        C14360o3.A0B(medium, 0);
        Bitmap decodeFile = BitmapFactory.decodeFile(medium.A0X);
        int A0M = new C60782q2(medium.A0X).A0M("Orientation", 1);
        if (A0M != 3) {
            if (A0M != 6) {
                i = 270;
                if (A0M != 8) {
                    i = 0;
                }
            } else {
                i = 90;
            }
        } else {
            i = 180;
        }
        int width = decodeFile.getWidth();
        int height = decodeFile.getHeight();
        if (d != null) {
            double d2 = width / height;
            double doubleValue = d.doubleValue();
            if (doubleValue < d2) {
                width = (int) (height * doubleValue);
            } else if (doubleValue > d2) {
                height = (int) (width / doubleValue);
            }
        }
        Bitmap A09 = C1NC.A09(decodeFile, width, height, i, false);
        C14360o3.A07(A09);
        return A09;
    }

    public static final void A01(Context context, Bitmap bitmap, UserSession userSession, String str, String str2, String str3) {
        MEE mee = new MEE(context, userSession, bitmap, str, str2, str3, 1);
        C14360o3.A0B(userSession, 0);
        AbstractC25233BEq.A0v(1, str, str2, str3);
        C40701ud A01 = AbstractC40691uc.A01(userSession);
        BitmapDrawable bitmapDrawable = null;
        C0CA A0T = AbstractC25227BEk.A0T(GraphQlCallInput.A02, str, "ig_thread_id");
        C0CA.A00(A0T, str2, AbstractC111324zv.A00(2658));
        C0CA.A00(A0T, str3, "full_collage_attachment_fbid");
        C2JM A0b = AbstractC25225BEi.A0b();
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AbstractC25233BEq.A0H(A0T, A0b, "input"), "IGDMediaCollageMutation", A0b.getParamsCopy(), AbstractC25225BEi.A0b().getParamsCopy(), IGDMediaCollageMutationResponseImpl.class, true, null, 0, null, "xig_igd_send_media_collage", AbstractC166987dD.A1E());
        C1Df ATV = A01.ATV(new C48146LSv(mee, 25), LTB.A00, pandoGraphQLRequest);
        if (bitmap != null) {
            bitmapDrawable = AbstractC43593JPy.A0A(context, bitmap);
        }
        C146106i8 A0Y = AbstractC31174DnI.A0Y();
        A0Y.A02 = context.getResources().getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
        A0Y.A0R = true;
        AbstractC25226BEj.A1N(context, A0Y, 2131965867);
        A0Y.A04 = bitmapDrawable;
        A0Y.A03();
        A0Y.A0K = false;
        AbstractC31175DnJ.A0l(context, A0Y, 2131965866);
        A0Y.A0A(new KYJ(ATV, 1));
        A0Y.A0L = true;
        AbstractC167007dF.A0J().postDelayed(new M1B(A0Y), 50L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0064, code lost:
    
        if (r0 == null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void A02(android.graphics.Bitmap r18, android.view.View r19, com.instagram.common.session.UserSession r20, com.instagram.model.direct.DirectThreadKey r21, java.lang.Integer r22) {
        /*
            r2 = 0
            r6 = r20
            X.C14360o3.A0B(r6, r2)
            r16 = r18
            if (r18 == 0) goto L78
            r9 = 0
            java.lang.String r11 = X.C50472Tr.A01()
            java.lang.String r1 = "direct_temp_photo"
            java.lang.String r0 = ".jpg"
            java.lang.String r12 = X.AbstractC917048o.A04(r1, r0)
            r8 = r16
            r10 = r6
            r13 = r2
            r14 = r2
            X.8Ee r12 = X.AbstractC209669Pc.A03(r8, r9, r10, r11, r12, r13, r14)
            r17 = r19
            android.content.Context r5 = X.AbstractC166997dE.A0L(r17)
            r8 = r21
            if (r21 == 0) goto L78
            X.7Cz r7 = X.EnumC159397Cz.A06
            com.instagram.pendingmedia.model.constants.ShareType r10 = com.instagram.pendingmedia.model.constants.ShareType.A0E
            X.1tg r0 = X.C40121td.A0G
            X.1td r11 = r0.A01(r5, r6)
            r13 = r9
            r14 = r9
            r15 = r9
            X.7Q4 r0 = X.LLY.A02(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            java.lang.String r5 = r0.A06
            com.instagram.pendingmedia.store.PendingMediaStore r21 = X.C25A.A00(r6)
            com.instagram.pendingmedia.store.PendingMediaStoreSerializer r4 = X.AnonymousClass257.A00(r6)
            if (r22 == 0) goto L66
            int r3 = r22.intValue()
            X.KZD r0 = X.AbstractC46790Kml.A00(r6)
            java.util.ArrayList r2 = r0.A02
            int r0 = r2.size()
            if (r0 > r3) goto L5e
            java.lang.String r1 = "MagicMediaRemixRepository"
            java.lang.String r0 = "Attempting to get index out of bounds layoutTypes"
            X.C0w9.A03(r1, r0)
        L5e:
            java.lang.Object r0 = X.AbstractC001800i.A0O(r2, r3)
            X.KdN r0 = (X.EnumC46246KdN) r0
            if (r0 != 0) goto L68
        L66:
            X.KdN r0 = X.EnumC46246KdN.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
        L68:
            X.M74 r15 = new X.M74
            r18 = r6
            r20 = r8
            r22 = r5
            r19 = r0
            r15.<init>(r16, r17, r18, r19, r20, r21, r22)
            r4.A06(r15)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.LKb.A02(android.graphics.Bitmap, android.view.View, com.instagram.common.session.UserSession, com.instagram.model.direct.DirectThreadKey, java.lang.Integer):void");
    }
}
