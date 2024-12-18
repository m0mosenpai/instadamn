package X;

import android.net.Uri;
import android.view.View;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.function.Function;

/* renamed from: X.Bzm, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27227Bzm extends AbstractC85543rj {
    public final int A00;
    public final Object A01;
    public final String A02;

    public C27227Bzm(String str, Function function, int i) {
        this.A00 = i;
        this.A02 = str;
        this.A01 = function;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        String str;
        String replace;
        Uri.Builder builder;
        String str2;
        Function function;
        InlineLinkUrn inlineLinkUrn;
        switch (this.A00) {
            case 0:
                str = this.A02;
                str.getClass();
                replace = str.toLowerCase().replace("#", "");
                builder = new Uri.Builder();
                str2 = "hashtag";
                String obj = builder.authority(str2).appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, replace).build().toString();
                function = (Function) this.A01;
                inlineLinkUrn = new InlineLinkUrn(str, obj);
                break;
            case 1:
                str = this.A02;
                str.getClass();
                replace = str.toLowerCase().replace("@", "");
                builder = new Uri.Builder();
                str2 = "mention";
                String obj2 = builder.authority(str2).appendQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID, replace).build().toString();
                function = (Function) this.A01;
                inlineLinkUrn = new InlineLinkUrn(str, obj2);
                break;
            default:
                String obj3 = new Uri.Builder().authority("expand_text").build().toString();
                function = (Function) this.A01;
                inlineLinkUrn = new InlineLinkUrn(this.A02, obj3);
                break;
        }
        function.apply(inlineLinkUrn);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27227Bzm(String str, Function function, int i, int i2) {
        super(false, i);
        this.A00 = 2;
        this.A01 = function;
        this.A02 = str;
    }
}
