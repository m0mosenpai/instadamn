package X;

import android.util.SparseArray;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import java.util.AbstractCollection;
import java.util.HashSet;

/* renamed from: X.Puk, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C58406Puk extends HashSet {
    public final int A00;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C58406Puk(int i) {
        super(12);
        Object obj;
        this.A00 = i;
        switch (i) {
            case 0:
                add("street-address");
                add("address-line1");
                add("address-line2");
                add("address-line3");
                add("address-level1");
                add("address-level2");
                add("address-level3");
                add("address-level4");
                add("country");
                add("country-name");
                obj = "postal-code";
                break;
            case 1:
                obj = "email";
                break;
            case 2:
                add(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
                add("given-name");
                obj = "family-name";
                break;
            case 3:
                add("tel");
                add("tel-country-code");
                add("tel-national");
                add("tel-area-code");
                add("tel-local");
                add("tel-local-prefix");
                obj = "tel-local-suffix";
                break;
            case 4:
                SparseArray sparseArray = AbstractC62857SUe.A00;
                A00(sparseArray, this, 46);
                A00(sparseArray, this, 47);
                A00(sparseArray, this, 69);
                A00(sparseArray, this, 70);
                A00(sparseArray, this, 95);
                A00(sparseArray, this, 96);
                A00(sparseArray, this, 59);
                A00(sparseArray, this, 97);
                A00(sparseArray, this, 76);
                A00(sparseArray, this, 137);
                A00(sparseArray, this, 79);
                A00(sparseArray, this, 80);
                A00(sparseArray, this, 178);
                A00(sparseArray, this, 241);
                obj = sparseArray.get(34);
                break;
            case 5:
                add("feed_suite_organic_campaign");
                add("story_suite_organic_campaign");
                obj = "interest_story";
                break;
            case 6:
                add("campaign_logout_push");
                obj = "force_logout_login_help";
                break;
            case 7:
                obj = "follower_activity";
                break;
            case 8:
                add("saved_music");
                obj = "saved_original_audio";
                break;
            default:
                obj = "bookmarked";
                break;
        }
        add(obj);
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.contains(obj);
            case 4:
            default:
                return super.contains(obj);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ boolean remove(Object obj) {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                if (!(obj instanceof String)) {
                    return false;
                }
                return super.remove(obj);
            case 4:
            default:
                return super.remove(obj);
        }
    }

    @Override // java.util.HashSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final /* bridge */ int size() {
        switch (this.A00) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return super.size();
            case 4:
            default:
                return super.size();
        }
    }

    public static void A00(SparseArray sparseArray, AbstractCollection abstractCollection, int i) {
        abstractCollection.add(sparseArray.get(i));
    }
}
