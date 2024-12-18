package com.instagram.tagging.model;

import X.AbstractC38048Gob;
import X.AnonymousClass182;
import X.C00O;
import X.EnumC53319Nhv;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import com.instagram.model.fbusertag.FBUserTag;
import com.instagram.model.people.PeopleTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTag;
import com.instagram.tagging.api.model.MediaSuggestedProductTagProductItemContainer;
import java.util.List;

/* loaded from: classes2.dex */
public abstract class Tag implements Parcelable {
    public PointF A00;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PointF A00() {
        if (!(this instanceof PeopleTag) && (this instanceof MediaSuggestedProductTag)) {
            return ((MediaSuggestedProductTag) this).A00;
        }
        return this.A00;
    }

    public EnumC53319Nhv A01() {
        if (this instanceof PeopleTag) {
            return EnumC53319Nhv.A07;
        }
        if (this instanceof MediaSuggestedProductTag) {
            return EnumC53319Nhv.A09;
        }
        return EnumC53319Nhv.A05;
    }

    public TaggableModel A02() {
        if (this instanceof PeopleTag) {
            return ((PeopleTag) this).A00;
        }
        if (this instanceof FBUserTag) {
            return ((FBUserTag) this).A02;
        }
        return ((MediaSuggestedProductTag) this).A07();
    }

    public String A03() {
        if (this instanceof PeopleTag) {
            return CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        }
        if (this instanceof MediaSuggestedProductTag) {
            return "product_id";
        }
        return "tag_id";
    }

    public String A04() {
        if (this instanceof PeopleTag) {
            return ((PeopleTag) this).A00.A04;
        }
        if (this instanceof MediaSuggestedProductTag) {
            List list = ((MediaSuggestedProductTag) this).A02;
            if (list != null && !list.isEmpty()) {
                AbstractC38048Gob.A01(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01);
                return AbstractC38048Gob.A01(((MediaSuggestedProductTagProductItemContainer) list.get(0)).A01).A0J;
            }
            return null;
        }
        return ((FBUserTag) this).A02.A01;
    }

    public void A05(AnonymousClass182 anonymousClass182) {
        if (this instanceof PeopleTag) {
            PeopleTag peopleTag = (PeopleTag) this;
            if (peopleTag.A08() != null) {
                anonymousClass182.A0T("show_category_of_user", peopleTag.A02);
                anonymousClass182.A0r("categories");
                anonymousClass182.A0c();
                anonymousClass182.A0u(peopleTag.A08());
                anonymousClass182.A0Z();
            }
        }
    }

    public void A06(TaggableModel taggableModel) {
        if (this instanceof MediaSuggestedProductTag) {
            throw C00O.createAndThrow();
        }
        if (this instanceof PeopleTag) {
            ((PeopleTag) this).A00 = (PeopleTag.UserInfo) taggableModel;
        } else {
            ((FBUserTag) this).A02 = (FBUserTag.FBUserInfo) taggableModel;
        }
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Tag)) {
            return false;
        }
        return ((Tag) obj).getId().equals(getId());
    }

    public final String getId() {
        if (this instanceof MediaSuggestedProductTag) {
            MediaSuggestedProductTag mediaSuggestedProductTag = (MediaSuggestedProductTag) this;
            StringBuilder sb = new StringBuilder();
            if (mediaSuggestedProductTag.A07() != null) {
                sb.append(mediaSuggestedProductTag.A07().A0H);
            }
            PointF pointF = mediaSuggestedProductTag.A00;
            if (pointF != null) {
                sb.append(pointF.toString());
            }
            return sb.toString();
        }
        return A02().getId();
    }

    public Tag(Parcel parcel, ClassLoader classLoader) {
        A06((TaggableModel) parcel.readParcelable(classLoader));
        this.A00 = (PointF) parcel.readParcelable(classLoader);
    }

    public int hashCode() {
        return (getId().hashCode() * 31) + getClass().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(A02(), i);
        parcel.writeParcelable(this.A00, i);
    }

    public Tag() {
    }
}
