package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.model.hashtag.HashtagImpl;
import com.instagram.model.hashtag.ImmutablePandoHashtag;

/* renamed from: X.VuP, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C69730VuP {
    public ImageUrl A00;
    public Boolean A01;
    public Boolean A02;
    public Boolean A03;
    public Boolean A04;
    public Boolean A05;
    public Boolean A06;
    public Boolean A07;
    public Integer A08;
    public Integer A09;
    public Integer A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public final Hashtag A0G;

    public C69730VuP(Hashtag hashtag) {
        C14360o3.A0B(hashtag, 1);
        this.A0G = hashtag;
        this.A01 = hashtag.AbF();
        this.A02 = hashtag.AbI();
        this.A08 = hashtag.B7N();
        this.A09 = hashtag.B7W();
        this.A0B = hashtag.B8G();
        this.A03 = hashtag.BDt();
        this.A0C = hashtag.getId();
        this.A04 = hashtag.CTY();
        this.A05 = hashtag.CXj();
        this.A0A = hashtag.BQb();
        this.A0D = hashtag.getName();
        this.A06 = hashtag.BXF();
        this.A00 = hashtag.Bhu();
        this.A0E = hashtag.BrA();
        this.A0F = hashtag.BrH();
        this.A07 = hashtag.CDb();
    }

    public final Hashtag A00() {
        Object A01;
        String str;
        Hashtag hashtag = this.A0G;
        if (hashtag instanceof ImmutablePandoHashtag) {
            TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
            C09530e4 c09530e4 = new C09530e4("allow_following", this.A01);
            C09530e4 c09530e42 = new C09530e4("allow_muting_story", this.A02);
            C09530e4 c09530e43 = new C09530e4("follow_status", this.A08);
            C09530e4 c09530e44 = new C09530e4("following", this.A09);
            C09530e4 c09530e45 = new C09530e4("formatted_media_count", this.A0B);
            C09530e4 c09530e46 = new C09530e4("hide_use_hashtag_button", this.A03);
            C09530e4 c09530e47 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_ID, this.A0C);
            C09530e4 c09530e48 = new C09530e4("is_eligible_for_survey", this.A04);
            C09530e4 c09530e49 = new C09530e4("is_local", this.A05);
            C09530e4 c09530e410 = new C09530e4("media_count", this.A0A);
            C09530e4 c09530e411 = new C09530e4(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, this.A0D);
            C09530e4 c09530e412 = new C09530e4("non_violating", this.A06);
            ImageUrl imageUrl = this.A00;
            if (imageUrl != null) {
                str = imageUrl.getUrl();
            } else {
                str = null;
            }
            A01 = AbstractC37303Gc4.A06(hashtag, new C09530e4[]{c09530e4, c09530e42, c09530e43, c09530e44, c09530e45, c09530e46, c09530e47, c09530e48, c09530e49, c09530e410, c09530e411, c09530e412, new C09530e4("profile_pic_url", str), new C09530e4("search_result_subtitle", this.A0E), new C09530e4("search_subtitle", this.A0F), new C09530e4("use_default_avatar", this.A07)});
        } else {
            A01 = A01();
        }
        return (Hashtag) A01;
    }

    public final HashtagImpl A01() {
        Boolean bool = this.A01;
        Boolean bool2 = this.A02;
        Integer num = this.A08;
        Integer num2 = this.A09;
        String str = this.A0B;
        Boolean bool3 = this.A03;
        String str2 = this.A0C;
        Boolean bool4 = this.A04;
        Boolean bool5 = this.A05;
        Integer num3 = this.A0A;
        String str3 = this.A0D;
        Boolean bool6 = this.A06;
        return new HashtagImpl(this.A00, bool, bool2, bool3, bool4, bool5, bool6, this.A07, num, num2, num3, str, str2, str3, this.A0E, this.A0F);
    }
}
