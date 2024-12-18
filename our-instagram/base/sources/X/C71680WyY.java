package X;

import android.view.View;
import android.widget.TextView;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import androidx.fragment.app.Fragment;
import com.facebook.R;
import com.facebook.react.modules.intent.IntentModule;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* renamed from: X.WyY, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C71680WyY implements InterfaceC09250da, InterfaceC16660sJ {
    public final int A00;
    public final Object A01;

    public C71680WyY(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    @Override // X.InterfaceC16660sJ
    public final Object invoke(Object obj) {
        C69634Vsb c69634Vsb;
        List list;
        int i;
        switch (this.A00) {
            case 0:
                ((Function) this.A01).apply(obj);
                return C0eB.A00;
            case 1:
                Fragment fragment = (Fragment) this.A01;
                TextView textView = (TextView) ((View) obj).findViewById(R.id.ig_boost_profile_placement);
                if (textView != null) {
                    String string = fragment.getString(2131954049);
                    AnonymousClass773.A01(android.net.Uri.parse(AbstractC111324zv.A00(2463)), textView, fragment.getString(2131954048), string);
                }
                return C0eB.A00;
            case 2:
                c69634Vsb = (C69634Vsb) obj;
                AbstractC167017dG.A1N(this.A01, c69634Vsb);
                list = C16930sl.A00;
                i = 0;
                break;
            case 3:
                PolymorphicSerializer polymorphicSerializer = (PolymorphicSerializer) this.A01;
                c69634Vsb = (C69634Vsb) obj;
                i = 0;
                AbstractC167007dF.A1K(polymorphicSerializer, c69634Vsb);
                SerialDescriptor serialDescriptor = C3RD.A00;
                C16930sl c16930sl = C16930sl.A00;
                c69634Vsb.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16930sl, serialDescriptor);
                c69634Vsb.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16930sl, AbstractC70142W6u.A00(AnonymousClass001.A0S("kotlinx.serialization.Polymorphic<", AbstractC13230m9.A01(((C0YZ) polymorphicSerializer.A01).A00), '>'), new C71687Wyk(), C3TO.A00, new SerialDescriptor[0]));
                list = polymorphicSerializer.A00;
                break;
            case 4:
                X6P x6p = (X6P) this.A01;
                C69634Vsb c69634Vsb2 = (C69634Vsb) obj;
                AbstractC167017dG.A1N(x6p, c69634Vsb2);
                Iterator A15 = AbstractC166997dE.A15(x6p.A02);
                while (A15.hasNext()) {
                    Map.Entry entry = (Map.Entry) A15.next();
                    c69634Vsb2.A00((String) entry.getKey(), C16930sl.A00, ((C3R9) entry.getValue()).getDescriptor());
                }
                return C0eB.A00;
            case 5:
                X6P x6p2 = (X6P) this.A01;
                c69634Vsb = (C69634Vsb) obj;
                i = 0;
                AbstractC167007dF.A1K(x6p2, c69634Vsb);
                SerialDescriptor serialDescriptor2 = C3RD.A00;
                C16930sl c16930sl2 = C16930sl.A00;
                c69634Vsb.A00(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, c16930sl2, serialDescriptor2);
                c69634Vsb.A00(IntentModule.EXTRA_MAP_KEY_FOR_VALUE, c16930sl2, AbstractC70142W6u.A00(AnonymousClass001.A0S("kotlinx.serialization.Sealed<", AbstractC13230m9.A01(((C0YZ) x6p2.A04).A00), '>'), new C71680WyY(x6p2, 4), C3TO.A00, new SerialDescriptor[0]));
                list = x6p2.A00;
                break;
            case 6:
                C71708WzZ c71708WzZ = (C71708WzZ) this.A01;
                int intValue = ((Number) obj).intValue();
                return AnonymousClass001.A0g(c71708WzZ.A03[intValue], ": ", c71708WzZ.A04[intValue].BtR());
            default:
                C71698Wz7 c71698Wz7 = (C71698Wz7) this.A01;
                C69634Vsb c69634Vsb3 = (C69634Vsb) obj;
                AbstractC167017dG.A1N(c71698Wz7, c69634Vsb3);
                SerialDescriptor descriptor = c71698Wz7.A00.getDescriptor();
                C16930sl c16930sl3 = C16930sl.A00;
                c69634Vsb3.A00("first", c16930sl3, descriptor);
                c69634Vsb3.A00("second", c16930sl3, c71698Wz7.A01.getDescriptor());
                c69634Vsb3.A00("third", c16930sl3, c71698Wz7.A02.getDescriptor());
                return C0eB.A00;
        }
        C14360o3.A0B(list, i);
        c69634Vsb.A00 = list;
        return C0eB.A00;
    }
}
