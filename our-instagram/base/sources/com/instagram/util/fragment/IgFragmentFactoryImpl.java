package com.instagram.util.fragment;

import X.AbstractC166987dD;
import android.os.Bundle;
import com.instagram.genericsurvey.fragment.GenericSurveyFragment;

@Deprecated
/* loaded from: classes7.dex */
public final class IgFragmentFactoryImpl {
    public static IgFragmentFactoryImpl A00;

    public final GenericSurveyFragment A01(Integer num, String str, String str2, String str3) {
        GenericSurveyFragment genericSurveyFragment = new GenericSurveyFragment();
        Bundle A0b = AbstractC166987dD.A0b();
        A0b.putString("GenericSurveyFragment.SURVEY_TYPE", str);
        A0b.putString("GenericSurveyFragment.EXTRA_DATA_TOKEN", str2);
        A0b.putString("GenericSurveyFragment.ARGUMENTS_TRACKING_TOKEN", str3);
        A0b.putString("GenericSurveyFragment.ARGUMENTS_PARENT_MEDIA_ID", null);
        if (num != null) {
            A0b.putInt("GenericSurveyFragment.ARGUMENTS_BLOKS_GENERIC_SURVEY_DELEGATE_KEY", num.intValue());
        }
        genericSurveyFragment.setArguments(A0b);
        return genericSurveyFragment;
    }

    public final GenericSurveyFragment A02(String str, String str2) {
        return A01(null, str, str2, null);
    }

    public static IgFragmentFactoryImpl A00() {
        IgFragmentFactoryImpl igFragmentFactoryImpl = A00;
        if (igFragmentFactoryImpl == null) {
            try {
                IgFragmentFactoryImpl igFragmentFactoryImpl2 = (IgFragmentFactoryImpl) Class.forName("com.instagram.util.fragment.IgFragmentFactoryImpl").newInstance();
                A00 = igFragmentFactoryImpl2;
                return igFragmentFactoryImpl2;
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }
        return igFragmentFactoryImpl;
    }
}
