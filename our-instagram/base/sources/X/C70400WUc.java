package X;

import android.os.Bundle;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.fbreactmodules.datepicker.DatePickerDialogModule;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.arads.ArAdsUIModel;
import org.json.JSONObject;

/* renamed from: X.WUc, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C70400WUc implements InterfaceC50417MNt {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C70400WUc(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    @Override // X.InterfaceC50417MNt
    public final /* bridge */ /* synthetic */ void run(Object obj) {
        String A0v;
        String str;
        String str2;
        AbstractC907342m A00;
        AbstractC907342m A002;
        AbstractC907342m A003;
        String str3;
        String str4;
        AbstractC907342m A004;
        String str5;
        if (this.A00 != 0) {
            VIN vin = (VIN) obj;
            if (vin instanceof C66544ULz) {
                AbstractC907342m abstractC907342m = (AbstractC907342m) ((C66544ULz) vin).A00;
                C14360o3.A0B(abstractC907342m, 0);
                String string = AbstractC12290kX.A00.getString(2131973939);
                String A005 = AbstractC43591JPw.A00(1265);
                AbstractC907342m A006 = abstractC907342m.A00(C44986Jvc.class, A005);
                if (A006 != null) {
                    String A05 = A006.A05(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    AbstractC907342m A007 = abstractC907342m.A00(C44986Jvc.class, A005);
                    if (A007 != null) {
                        ArAdsUIModel arAdsUIModel = new ArAdsUIModel(string, null, null, null, null, null, A05, A007.A05("retailer_id"));
                        ((C23656Adr) this.A01).A02(EnumC223239t9.A08, "", null);
                        C69381VmR c69381VmR = (C69381VmR) this.A02;
                        Bundle bundle = new Bundle();
                        bundle.putSerializable("camera_entry_point", c69381VmR.A03);
                        AbstractC907342m A008 = abstractC907342m.A00(C44978JvU.class, AbstractC43591JPw.A00(758));
                        if (A008 != null) {
                            str5 = A008.A05("effect_id");
                        } else {
                            str5 = null;
                        }
                        bundle.putString("effect_id", str5);
                        bundle.putString("encoded_token", c69381VmR.A06);
                        bundle.putParcelable(AbstractC111324zv.A00(721), arAdsUIModel);
                        bundle.putString("device_position", c69381VmR.A00);
                        bundle.putBoolean(AbstractC111324zv.A00(2638), true);
                        bundle.putString(DatePickerDialogModule.ARG_MODE, c69381VmR.A01);
                        C6XJ A02 = C6XJ.A02(c69381VmR.A02, bundle, c69381VmR.A05, TransparentModalActivity.class, "ar_ads_camera");
                        AbstractC31179DnN.A1S(A02);
                        C11T.A02(new RunnableC71471WuX(c69381VmR, A02));
                        return;
                    }
                    throw new IllegalStateException("Required value was null.");
                }
                throw new IllegalStateException("Required value was null.");
            }
            if (!(vin instanceof UM0)) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            sb.append("Failed to fetch ProductArMetadata ");
            A0v = AbstractC166997dE.A0v(((UM0) vin).A00, sb);
        } else {
            VIN vin2 = (VIN) obj;
            if (vin2 instanceof C66544ULz) {
                AbstractC907342m abstractC907342m2 = (AbstractC907342m) ((C66544ULz) vin2).A00;
                C69662Vt3 c69662Vt3 = (C69662Vt3) this.A02;
                String str6 = c69662Vt3.A07;
                String str7 = c69662Vt3.A06;
                C14360o3.A0B(abstractC907342m2, 0);
                String A052 = abstractC907342m2.A05("cta_text");
                AbstractC907342m A009 = abstractC907342m2.A00(C44974JvQ.class, "effect");
                if (A009 != null) {
                    str = A009.A05(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                } else {
                    str = null;
                }
                AbstractC907342m A0010 = abstractC907342m2.A00(C44974JvQ.class, "effect");
                if (A0010 != null && (A004 = A0010.A00(C44973JvP.class, "thumbnail")) != null) {
                    str2 = A004.A05("uri");
                } else {
                    str2 = null;
                }
                String A053 = abstractC907342m2.A05("outbound_uri");
                if (str6 == null || str6.length() == 0) {
                    AbstractC907342m A0011 = abstractC907342m2.A00(C44974JvQ.class, "effect");
                    if (A0011 != null && (A00 = A0011.A00(C66568UNe.class, "attribution_user")) != null) {
                        str6 = A00.A05(AbstractC50529MSi.A00());
                    } else {
                        str6 = null;
                    }
                }
                if (str7 == null || str7.length() == 0) {
                    AbstractC907342m A0012 = abstractC907342m2.A00(C44974JvQ.class, "effect");
                    if (A0012 != null && (A002 = A0012.A00(C66568UNe.class, "attribution_user")) != null && (A003 = A002.A00(C66567UNd.class, "profile_picture")) != null) {
                        str7 = A003.A05("uri");
                    } else {
                        str7 = null;
                    }
                }
                AbstractC907342m A0013 = abstractC907342m2.A00(C44976JvS.class, "product");
                if (A0013 != null) {
                    JSONObject jSONObject = A0013.A00;
                    if (jSONObject.isNull(PublicKeyCredentialControllerUtility.JSON_KEY_ID)) {
                        str3 = null;
                    } else {
                        str3 = jSONObject.optString(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
                    }
                } else {
                    str3 = null;
                }
                AbstractC907342m A0014 = abstractC907342m2.A00(C44976JvS.class, "product");
                if (A0014 != null) {
                    JSONObject jSONObject2 = A0014.A00;
                    if (jSONObject2.isNull("retailer_id")) {
                        str4 = null;
                    } else {
                        str4 = jSONObject2.optString("retailer_id");
                    }
                } else {
                    str4 = null;
                }
                ArAdsUIModel arAdsUIModel2 = new ArAdsUIModel(A052, str, str2, A053, str6, str7, str3, str4);
                A0v = abstractC907342m2.A05("effect_fetch_failure_reason");
                if (A0v == null) {
                    ((C23656Adr) this.A01).A02(EnumC223239t9.A08, "", null);
                    AbstractC58002lE.A03(c69662Vt3.A08, c69662Vt3.A0A, new C70852WiI(c69662Vt3, arAdsUIModel2));
                    return;
                }
            } else {
                if (!(vin2 instanceof UM0)) {
                    return;
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("Failed to fetch Ad context ");
                A0v = AbstractC166997dE.A0v(((UM0) vin2).A00, sb2);
            }
        }
        ((C23656Adr) this.A01).A02(EnumC223239t9.A06, "", A0v);
    }
}
